package ua.in.codegym.lesson_025;

import java.util.HashMap;
import java.util.Map;

public class AbcNumber {
    public static void main(String[] args) {
        System.out.println(convert("bcd"));

    }

    public static int convert(String num) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put((char) ('a' + i) , i);
        }

        for (int i = 0; i < num.length(); i++) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (num.charAt(i) == entry.getKey()) {
                    stringBuilder.append(entry.getValue());
                }
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
