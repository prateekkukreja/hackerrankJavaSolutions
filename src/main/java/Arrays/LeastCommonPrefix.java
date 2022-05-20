package main.java.Arrays;

public class LeastCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flick", "fling", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        String val = strs[0];

        for (int x = 1; x < strs.length; x++) {
            String temp = strs[x];

            // If doesn't contain prefix, shorten prefix, until it does;
            while (!temp.startsWith(val)) {
                if (val.length() == 1) {
                    val = "";
                    break;
                }
                val = val.substring(0, val.length() - 1);
            }
        }
        return val;
    }
}
