package ua.in.codegym.lesson_001;


public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sum(2356));
    }

    public static int sum(int number) {
        char [] chars = String.valueOf(number).toCharArray();
        int sum=0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                int digit = Character.getNumericValue(chars[i]);
                sum +=digit;
            }
        }
        return sum;
    }
}
