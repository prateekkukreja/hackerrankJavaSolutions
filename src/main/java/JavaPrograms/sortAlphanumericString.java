package JavaPrograms;

import java.util.*;

public class sortAlphanumericString {

    HashMap<Character, Integer> map = new HashMap<>();
//    op = 7 a
//    1 b
//    3 c8d

    public static void main(String[] args) {

        sortAlphanumericString test = new sortAlphanumericString();
        String s = "aaaabbbbcccaaaddaaccbbbaacbbbdacacbd";
        char[] arr = s.toCharArray();
        test.getString(arr);
    }

    public void getString(char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Vector<Object> vec = new Vector<>();
        int i = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            vec.add(entry.getValue() + "" + entry.getKey());
        }

        StringBuilder build = new StringBuilder();
        Iterator it = vec.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "");
            build.append(it.next());
        }

        char[] arr1 = build.toString().toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);
    }
}