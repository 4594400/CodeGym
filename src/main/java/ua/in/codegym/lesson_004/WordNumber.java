package ua.in.codegym.lesson_004;


public class WordNumber {
    public static void main(String[] args) {
        System.out.println(count("I"));
    }

    public static boolean isLetter(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }

    public static int count(String input) {
        int count=0;
        boolean flag = false;
        if (input.length() == 0) return 0;

        for (int i = 0; i < input.length(); i++) {
            if (isLetter(input.charAt(i))) {
                flag = true;
            } else if (flag){
                count++;
                flag = false;
            }
        }
        if (flag) {
            count++;
        }
        return count;
    }
}