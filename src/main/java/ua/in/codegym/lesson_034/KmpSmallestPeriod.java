package ua.in.codegym.lesson_034;

/*Найменший Період. Алгоритм Кнута — Морриса — Пратта

        A character string is said to have period k if it can be formed by concatenating one or more repetitions of another string of length k.
        For example, the string "abcabcabcabc" has period 3, since it is formed by 4 repetitions of the string "abc".
        It also has periods 6 (two repetitions of "abcabc") and 12 (one repetition of "abcabcabcabc").
        Write a program to read a character string and determine its smallest period
        Return (String) substring;*/

public class KmpSmallestPeriod {
    public static void main(String[] args) {
        System.out.println(findSmalletstPeriod("abcdabcdabcd"));

    }

    public static String findSmalletstPeriod(String input) {
        int i, j;
        for (i = 1; i <= input.length(); i++) {
                for (j = i; j < input.length(); j++)
                    if (input.charAt(j) != input.charAt(j % i))
                        break;
                if (j == input.length()) {
                    break;
                }
        }
        return input.substring(0, i);
    }

}
