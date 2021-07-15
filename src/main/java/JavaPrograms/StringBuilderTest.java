package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringBuilderTest {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Kooxy");
        map.put(3, "Geetika");
        map.put(10, "Namita");
        map.put(6, "Mumma");
        map.put(7, "Papa");

        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(map.get(7));
        char[] arr = new char[10];
        sb.getChars(0, sb.length(), arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
