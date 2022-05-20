package Stacks;

import java.util.*;

class ValidParantheses {

    public static void main(String[] args) {
        System.out.println(isValid("{}(){}[]"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                if (stack.isEmpty()) return false;
                if (ch == ')') {
                    if (stack.peek() != '(') return false;
                    stack.pop();
                }
                if (ch == '}') {
                    if (stack.peek() != '{') return false;
                    stack.pop();
                }
                if (ch == ']') {
                    if (stack.peek() != '[') return false;
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}