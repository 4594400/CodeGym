package ua.in.codegym.lesson_009;


public class Main {
    public static void main(String[] args) {
        int [] x = {0,0};
        int [] h = {20,10};
        int [] w = {10,20};
        RectangleSquare rectangleSquare = new RectangleSquare();
        System.out.println(rectangleSquare.measure(x, h, w));


    }
}
