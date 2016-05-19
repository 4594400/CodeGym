package ua.in.codegym.lesson_008;


import java.util.HashMap;
import java.util.Map;

public class ColorChain {
    private Map<Integer, Integer> colorCount = new HashMap<>();

    public static void main(String[] args) {

        ColorChain colorChain = new ColorChain();
        System.out.println(colorChain.count(10));

        for (Map.Entry entry : colorChain.colorCount.entrySet()) {
            System.out.println(entry);
        }
    }


    public int count(int N) {
        int result;
        if (N <= 2) return N;
        if (N == 3) return N+1;

        int white = colorCount.containsKey(N - 1) ? colorCount.get(N - 1) : count(N - 1);
        int yellow = colorCount.containsKey(N - 2) ? colorCount.get(N - 2) : count(N - 2);
        int black = colorCount.containsKey(N - 3) ? colorCount.get(N - 3) : count(N - 3);

            colorCount.put(N - 1, white);
            colorCount.put(N - 2, yellow);
            colorCount.put(N - 3, black);

        result = white + yellow + black;

        return result;
    }
}
