package AppleTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSubStringWithConstraint {

    public static void main(String[] args) {

        String[] arr = {"Get a Life dude", "QWERTY QWERTY", "1234567PK"};
        int n = arr.length;
        System.out.println(reverseString(arr, n));
        // {"teG A efiL eduD", "ytrewQ ytrewQ", "pk7654321"}
    }

    public static String reverseWord(String str) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }

    //bruteForce
    public static String reverseString(String[] arr, int n) {
        String out = null;
        String[] outArr = new String[n];
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String subStr = "";

        for (int i = 0; i < n; i++) {
            subStr = arr[i];
            try {
                sb = new StringBuilder();
                String[] val = subStr.split(" ");
                for (int j = 0; j < val.length; j++) {
                    sb.append(" ");
                    String word = val[j];

                    for (int k = word.length() - 1; k >= 1; k--) {
                        // char fLower = Character.toLowerCase(word.charAt(k));
                        sb.append(Character.toLowerCase(word.charAt(k)));
                    }
                    char fUpper = Character.toUpperCase(word.charAt(0));
                    sb.append(fUpper);
//                    sb.append(" ");
//                    System.out.print(sb);
                }
                outArr[i] = sb.toString().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Arrays.toString(outArr);
    }
}
