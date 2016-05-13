package ua.in.codegym.lesson_009;


import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class RectangleSquare {

    private int getArea(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (y2 - y1);
    }

    public int measure(int[] x, int[] h, int[] w) {

        Deque<Square> squares = new LinkedList<>();
        for (int i = 0; i < x.length; i++) {
            squares.add(new Square(x[i], h[i], w[i]));
        }
        int sum = 0;

        List<Integer> X = new LinkedList<>();
        List<Integer> Y = new LinkedList<>();
        for (Square s : squares) {
            X.add(s.x1);
            X.add(s.x2);
            Y.add(s.y1);
            Y.add(s.y2);
        }

        for (int i = 0; i < X.size() - 1; i++) {
            if (X.get(i).equals(X.get(i + 1))) {
                X.remove(i);
            }
        }
        for (int i = 0; i < Y.size() - 1; i++) {
            if (Y.get(i).equals(Y.get(i + 1))) {
                Y.remove(i);
            }
        }

        Comparator ascending = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1 : (o1 < o2 ? -1 : 0);
            }
        };

        X.sort(ascending);
        Y.sort(ascending);

        for (int i = 0; i < Y.size() - 1; i++) {
            for (int j = 0; j < X.size() - 1; j++) {
                for (Square s : squares) {
                    if (X.get(j) >= s.x1 && X.get(j + 1) <= s.x2 && Y.get(i) >= s.y1 && Y.get(i + 1) <= s.y2) {
                        sum += getArea(X.get(j), Y.get(i), X.get(j + 1), Y.get(i + 1));
                        break;
                    }
                }
            }
        }

        return sum;
    }

    class Square {
        public int x1;  // lower left point
        public int y1;
        public int x2;  // upper right point
        public int y2;

        public Square(int x, int h, int w) {
            this.x1 = x;
            this.y1 = 0;
            this.x2 = x + w;
            this.y2 = h;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "x1=" + x1 +
                    ", y1=" + y1 +
                    ", x2=" + x2 +
                    ", y2=" + y2 +
                    '}';
        }
    }
}