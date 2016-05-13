package ua.in.codegym.lesson_010;


public class LongestStabilityPeriod {
    public static void main(String[] args) {

        int[] input = {902, 902, 901, 902, 902, 903, 902, 902, 901, 902, 901, 901, 902, 903};
        System.out.println(count(input));
    }


    public static int count(int[] gdp) {
        if (gdp.length == 0) return 0;
        if (gdp.length == 1) return 1;

        int result = 0;
        int count = 0;
        for (int i = 0; i < gdp.length; i++) {
            int max = gdp[i];
            int min = gdp[i];
            for (int j = i; j < gdp.length; j++) {
                if (gdp[j] > max) max = gdp[j];
                if (gdp[j] < min) min = gdp[j];
                if (max - min > 1) {
                    if (count > result) result = count;
                    count = 0;
                    break;
                }
                if (Math.abs(gdp[i] - gdp[j]) <= 1) {
                    count++;
                }
            }
        }
        return result;
    }
}

