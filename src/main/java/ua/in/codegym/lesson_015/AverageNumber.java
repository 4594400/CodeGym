package ua.in.codegym.lesson_015;


public class AverageNumber {
    public static void main(String[] args) {
        System.out.println(average(4, 6));

    }

    public static int average(int a, int b) {

        return ((a>0 && b>0) && (a%2 != 0 && b%2 != 0)) ? (a/2 + b/2 + 1) : ((a < 0 && b < 0) && (a%2 != 0 && b%2 != 0)) ? (a/2 + b/2 - 1) : (a/2 + b/2);
    }
}
