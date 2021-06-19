package JavaPrograms;

import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
        String A = "tattarrattat";
        checkPalindrome(A);
        /* Enter your code here. Print output to STDOUT. */
    }

    public static void checkPalindrome(String inp) {
        int count = 0;
        for (int i = 0; i < inp.length() / 2; i++) {
            if (inp.charAt(i) == inp.charAt(inp.length() - i - 1))
                count++;
        }
            System.out.println((count == inp.length() / 2) ? "Yes" : "No");
        }
}
