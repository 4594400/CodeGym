package ua.in.codegym.lesson_035;


public class KmpSubMove {
    public static void main(String[] args) {
        System.out.println(subMoveQuantity("a","a"));

    }

    public static int subMoveQuantity(String inputStr, String resultStr) {
        if (inputStr.length()==1) return 0;
        if (inputStr.length()!=resultStr.length()) return -1;
        for (int i = inputStr.length()-1; i >=0; i--) {
            if ((inputStr.substring(i)+inputStr.substring(0,i)).equals(resultStr)) {
                return inputStr.length()-i;
            }
        }
        return -1;
    }
}
