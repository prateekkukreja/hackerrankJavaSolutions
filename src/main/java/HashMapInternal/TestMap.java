package HashMapInternal;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        Map<Employee, String> map = new HashMap<>();
        Employee e1 = new Employee("Prateek", 20);

        map.put(e1, "Permanent");
       // System.out.println(map.get(e1));
        e1.setAge(30);
        System.out.println(map.get(e1));
    }
}
