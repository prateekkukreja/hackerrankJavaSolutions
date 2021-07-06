package JavaPrograms;

import java.util.Locale;

public class CheckPalindrome {

    public static void main(String[] args) {
        String str = "Jalaj";
        String str1 = "ABBA";
        String str2 = "Harmonium";
        System.out.println(checkString(str));
        System.out.println(checkString(str1));
        System.out.println(checkString(str2));
    }

    private static boolean checkString(String str) {
        str = str.toLowerCase(Locale.ROOT);
        char[] arr = str.toCharArray();
        int i = 0; int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                System.out.println("Not a Palindrome");
                return false;
            } else {
                i++;
                j--;
            }
        }
    return true;
    }
}
