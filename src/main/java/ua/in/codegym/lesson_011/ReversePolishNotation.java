package ua.in.codegym.lesson_011;


import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String tokens = new String("2 1 + 3 *");
        System.out.println(evaluate(tokens));

    }

    public static int evaluate(String expression) {
        String[] tokens = expression.split(" ");
        int result;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();

        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a / b));
                        break;
                }
            }
        }
        result = Integer.valueOf(stack.pop());
        return result;
    }


}
