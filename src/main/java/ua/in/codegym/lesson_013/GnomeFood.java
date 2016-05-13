package ua.in.codegym.lesson_013;


import java.util.Arrays;

public class GnomeFood {
    public static void main(String[] args) {
        int [] g = new int[] {5, 7, 6, 9, 4};
        int [] p = new int[] {8, 5, 6, 2, 3};

        System.out.println(Arrays.toString(find(g, p)));


    }
    public static int getRank(int[] ints, int elementIndex) {
        int rank = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[elementIndex] < ints[i]) {
                rank++;
            }
        }
        return rank;
    }

    public static int[] find(int[] gnames, int[] portions) {
        int[] gIndexes = new int[gnames.length];
        int[] pIndexes = new int[gnames.length];
        int[] result = new int[gnames.length];

        for (int i = 0; i < gnames.length; i++) {
            gIndexes[i] = getRank(gnames, i);
        }
        for (int i = 0; i < portions.length; i++) {
            pIndexes[i] = getRank(portions, i);
        }
        for (int i = 0; i < gIndexes.length; i++) {
            for (int j = 0; j < pIndexes.length; j++) {
                if (gIndexes[i] == pIndexes[j]) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }
}
