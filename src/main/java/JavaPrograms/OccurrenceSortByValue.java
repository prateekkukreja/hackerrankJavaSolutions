package main.java.JavaPrograms;

import java.util.*;

public class OccurrenceSortByValue {

    public static void main(String[] args) {

        String val = "ddpppccccaaaaak";
        //—>a5c4p3d2k
        System.out.println(testMethod(val));
    }

    public static Map<Character, Integer> testMethod(String inp) {

        HashMap<Character, Integer> map = new HashMap<>();
        TreeMap<Character, Integer> test = new TreeMap<>();

        char[] charArr = inp.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (map.containsKey(charArr[i])) {
                map.put(charArr[i], map.get(charArr[i]) + 1);
            } else {
                map.put(charArr[i], 1);
            }
        }
        test.putAll(map);
        return test;
    }
}