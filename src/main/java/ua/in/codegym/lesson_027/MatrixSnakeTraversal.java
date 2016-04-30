package ua.in.codegym.lesson_027;


import java.util.Arrays;

public class MatrixSnakeTraversal {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
        System.out.println(Arrays.toString(print(ints)));
    }

    public static int[] print(int[][] input) {
        int m = input.length;
        int n = input[0].length;

        int out[] = new int[m * n];
        boolean direction = true;
        int z = 0;

        for (int y = 0; y <= n - 1; y++) {
            if (direction) {
                for (int x = 0; x <= m - 1; x++) {
                    out[z] = input[x][y];
                    z++;
                }
                direction = false;
            } else {
                for (int x = m - 1; x >= 0; x--) {
                    out[z] = input[x][y];
                    z++;
                }
                direction = true;
            }
        }
        return out;
    }
}
