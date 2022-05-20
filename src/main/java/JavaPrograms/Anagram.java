package main.java.JavaPrograms;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    static boolean flag = false;

    public static void main(String[] args) {

        String a = "Hello".toLowerCase(Locale.ROOT);
        String b = "hellP".toLowerCase(Locale.ROOT);

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

//        checkAnagramsWithJavaUtils(arr1, arr2);
        flag = checkAnagramsWithoutJavaUtils(a, b);
        if (flag)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }

    public static boolean checkAnagramsWithoutJavaUtils(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < a.length(); i++) {
            sum += a.charAt(i) - 'a';
            sum1 += b.charAt(i) - 'a';
        }
        if (sum != sum1) {
            return false;
        }
        return true;
    }

    public static void checkAnagramsWithJavaUtils(char[] arr1, char[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean val = Arrays.equals(arr1, arr2);
        if (val == true) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
