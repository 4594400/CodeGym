package ua.in.codegym.lesson_017;


//import java.math.BigInteger;

public class CountBits {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
        System.out.println(i + " " + count(i));
        }
    }

    public static int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
       // or one line:
       // return Integer.bitCount(num);
    }

}



