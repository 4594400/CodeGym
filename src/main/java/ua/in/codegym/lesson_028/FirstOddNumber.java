package ua.in.codegym.lesson_028;


public class FirstOddNumber {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 6, 8, 9, 3, 44};

        System.out.println(find(intArray));
    }

    public static int find(int[] input) {

        for (int i = 0; i < input.length; i++)
        {
            if (input[i]%2!=0) {
                return i;
            }
        }
        return -1;
    }
}