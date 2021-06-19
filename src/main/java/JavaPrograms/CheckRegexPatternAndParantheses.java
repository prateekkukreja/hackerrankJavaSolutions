package JavaPrograms;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class CheckRegexPatternAndParantheses {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of tests : ");
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases-- > 0) {
            String pattern = scan.nextLine();
            CheckPatterCompileMethod(pattern);
        }

        System.out.println("Enter parantheses to check : ");
        String pattern = scan.nextLine();
        System.out.println(checkBalancedParanthesesUsingStackDeque(pattern));
        System.out.println(checkEqualParantheses(pattern));
        scan.close();
    }

    private static boolean checkEqualParantheses(String pattern) {

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < pattern.length(); i++) {
            char x = pattern.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                stack.push(pattern.charAt(i));
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char ch;
            if (x == ')' || x == '}' || x == ']') {
                ch = stack.pop();
                continue;
            }
        }
        return (stack.isEmpty());
    }

    private static boolean checkBalancedParanthesesUsingStackDeque(String pattern) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < pattern.length(); i++) {
            char x = pattern.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                stack.push(pattern.charAt(i));
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void CheckPatterCompileMethod(String pattern) {
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException exception) {
            System.out.println("Invalid");
        }
    }

}
