package JavaPrograms;

import java.util.*;

public class D11NonRepeatingCharacter {

    // Driver Code
    public static void main(String[] args) {
        String str = "INCOMPREHENSIVE";
        System.out.print(findLongestSubstring(str));
    }

    public static String findLongestSubstring(String str) {

        int i;
        int n = str.length();

        int st = 0;
        int currlen = 0;
        int maxlen = 0;
        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0), 0);

        for (i = 1; i < n; i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i);
            } else {
                if (map.get(str.charAt(i)) >= st)
                    currlen = i - st; //8 == > substring1
                if (maxlen < currlen) {
                    maxlen = currlen;
                    start = st;  //
                    st = map.get(str.charAt(i)) + 1;
                }
                //
                map.replace(str.charAt(i), i);
            }
        }

            if (maxlen < i - st) {
                maxlen = i - st;
                start = st;
            }


        return str.substring(start, start + maxlen);
    }
}
