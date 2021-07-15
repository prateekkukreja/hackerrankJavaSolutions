package HashMapInternal;

import java.util.*;

public class SortMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Kooxy");
        map.put(23, "Var");
        map.put(99, "Goff");
        map.put(3, "Geetika");
        map.put(10, "Namita");
        map.put(6, "Mumma");
        map.put(7, "Papa");

        System.out.println(map);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey())
                .forEach(System.out::println);

    }

}
