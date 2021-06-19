package JavaPrograms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class MostActiveUsersList {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static void main(String[] args) {

        List<String> customers = new ArrayList<>();
        customers.add("abc");
        customers.add("def");
        customers.add("zz");
        customers.add("ytyu");
        customers.add("abc");
        customers.add("ytyu");
        customers.add("zz");
        int n = customers.size();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(customers.get(i))) {
                map.put(customers.get(i), 1);
            } else {
                map.put(customers.get(i), map.get(customers.get(i)) + 1);
            }
        }

        List<String> arr = new ArrayList<>();

        for (Map.Entry set : map.entrySet()) {
            int val = (int) set.getValue();
            if (val * 100 / 5 >= n) {
                arr.add((String) set.getKey());
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
    }

}
