package ua.in.codegym.lesson_012;


import java.util.Deque;
import java.util.LinkedList;

public class UnixPath {
    public static void main(String[] args) {

        System.out.println("1 -------------  " + simplify("/home/../var/./lib//file.txt"));
        System.out.println("1 -------------  " + simplify("/var/lib/../log/./../tmp/data///"));
        System.out.println("2 -------------  " + simplify("/var//lib"));
        System.out.println("3 -------------  " + simplify("//"));
        System.out.println("4 -------------  " + simplify("/."));

    }

    public static String simplify(String input) {
        Deque<String> deque = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        String[] strings = input.split("/");

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("..") && !deque.isEmpty()) {
                deque.pop();
            } else if (strings[i].equals(".") || strings[i].equals("")) {
                //NOP
            } else {
                deque.push(strings[i]);
            }
        }
        while (true) {
            if (!(builder.length() > 1 && deque.isEmpty())) {
                builder.append("/");
            }
            if (!deque.isEmpty()) {
                builder.append(deque.pollLast());
            } else {
                break;
            }
        }
        return builder.toString();
    }
}

