package ua.in.codegym.lesson_014;

public class PositiveAverageNumber {
    public static void main(String[] args) {
        System.out.println(average(2, 4));
        System.out.println(average(4, 7));
    }

    public static int average(int a, int b) {
        int result =  ((a%2!=0 && b%2!=0) ? (a/2+b/2)+1 : (a/2+b/2));
        return result;
    }
}
