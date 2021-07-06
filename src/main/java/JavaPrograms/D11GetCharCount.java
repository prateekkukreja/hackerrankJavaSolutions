package JavaPrograms;

import java.util.*;

public class D11GetCharCount {

    public static void main(String[] args) {
        String str = "AAABCCDDDD ewfwed dwdwd qdqw";
//str = "A"
//        characterCount(str);
        compressInput(str);
    }

    static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    static void compressInput(String str) {
        String[] arr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);     // A
            }
        }

        for (Map.Entry set : map.entrySet()) {
            System.out.print(set.getKey() + "" + set.getValue() + "");
        }

    }
}
