package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Anagram {

    static boolean flag = false;

    public static void main(String[] args) {

        String a = "Hello".toLowerCase(Locale.ROOT);
        String b = "hello".toLowerCase(Locale.ROOT);

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
        boolean flag = false;
        if (a.length() != b.length()) {
            return false;
        }

        int sum = 0;
        for (int c = 'a'; c < 'z'; c++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == c) {
                    sum++;
                }
                if (b.charAt(i) == c) {
                    sum--;
                }
                if (sum != 0) {
                    return false;
                }
            }
            return true;
        }

        return flag;
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
