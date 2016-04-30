package ua.in.codegym.lesson_026;


public class JoinCharacters {
    public static void main(String[] args) {
        char [] chars = new char[] {'2', '3', '6', '5'};
        System.out.println(join(chars));
    }

    public static int join(char[] input) {
        int result=0;

        for (int i = 0; i < input.length; i++) {
            result = result + Character.getNumericValue(input[i]) * (int) (Math.pow(10, input.length-i-1));
        }
        return result;
    }
}
