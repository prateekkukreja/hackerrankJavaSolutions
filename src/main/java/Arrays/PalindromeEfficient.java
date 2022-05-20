package main.java.Arrays;

public class PalindromeEfficient {

    public boolean isPalindrome(int x) {

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return String.valueOf(x).equals(sb.reverse().toString());
    }
}
