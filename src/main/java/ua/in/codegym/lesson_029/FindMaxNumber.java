package ua.in.codegym.lesson_029;


import java.util.Arrays;

public class FindMaxNumber {

    public static void main(String[] args) {
        int [] ints = new int[] {4,8,6,4,3,2,94};
        System.out.println(max(ints));
    }

    public static int max(int[] input) {
        Arrays.sort(input);
        return input[input.length-1];
    }
}
