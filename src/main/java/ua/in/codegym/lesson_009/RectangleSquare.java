package ua.in.codegym.lesson_009;


import java.util.*;

class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        List<Integer> globalArea = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {           
            increaseGlobalArea(globalArea, x[i] + w[i]);
            for (int j = 0; j < w[i]; j++) {
                if (globalArea.get(x[i] + j) < h[i]) {
                    globalArea.set(x[i] + j, h[i]);
                }
            }
        }
        return sumList(globalArea);
    }    
    private void increaseGlobalArea(List<Integer> area, int newSize) {
        if (area.size() < newSize) {
            for (int i = area.size(); i < newSize; i++) {
                area.add(0);
            }
        }
    }    
    private int sumList(List<Integer> list) {
        int result = 0;
        for (int value : list) {
            result += value;
        }
        return result;
    }
}