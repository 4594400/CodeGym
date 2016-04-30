package ua.in.codegym.lesson_019;


import java.util.Map;
import java.util.TreeMap;

public class AddNumberBase36 {
    public static void main(String[] args) {

        System.out.println(add("19", "4"));
    }

    public static String add(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<Character, Integer> digits = new TreeMap<Character, Integer>();
        for (int i = 0; i < Character.MAX_RADIX; i++) {
            digits.put(Integer.toString(i, Character.MAX_RADIX).charAt(0), i);
        }

        StringBuilder res = new StringBuilder();
        int ai = a.length() - 1, bi = b.length() - 1;
        int acc = 0;

        while (ai >= 0 || bi >= 0) {
            int ad = (ai >= 0) ? digits.get(a.charAt(ai--)) : 0;
            int bd = (bi >= 0) ? digits.get(b.charAt(bi--)) : 0;
            int sum = ad + bd + acc;
            acc = sum/36;
            sum %= 36;
            char d = (sum < 10) ? (char)('0'+sum) : (char)('a' + (sum-10));
            res.append(d);
        }
        if (acc > 0) {
            res.append(acc);
        }
        return res.reverse().toString();
    }

}
