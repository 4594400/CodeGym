package ua.in.codegym.lesson_007;


public class Doubles {
    public static void main(String[] args) {
        System.out.println(parse(".e2"));
    }

    public static Double parse(String s) {
            try {
                return Double.parseDouble(s);
            } catch (Exception e) {
                return null;
            }
    }
}

