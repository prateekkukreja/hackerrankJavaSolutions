package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GetUniqueCharsInString {

    public static void main(String[] args) {

        String s = "zewrxctyvbunijknhbvctexrwrdtfyujntyrewrtyuinmxz";

        checkOnlyOneOccurance(s);
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry set : map.entrySet()) {
            System.out.print(set.getKey() + " ");
        }
    }

    static void checkOnlyOneOccurance(String s) {
        int cnt = 0;
        char[] arr = s.toCharArray();

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if (set.add(arr[i])) ;
        }
    }
}