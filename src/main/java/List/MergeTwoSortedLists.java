package List;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSortedLists {

    public static void main(String[] args) throws Exception {

        List<Integer> inp1 = new ArrayList<>(Arrays.asList(1, 3, 7, 9, 11));
        List<Integer> inp2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        System.out.println(mergeLists(inp1, inp2));
    }

    private static List<Integer> mergeLists(List<Integer> inp1, List<Integer> inp2) throws Exception {

        List<Integer> integerList = new ArrayList<>();
        int n = 0;
        boolean flag = false;

        if (inp1.size() > inp2.size()) {
            n = inp2.size();
            flag = true;       // if list1 is bigger
        } else {
            n = inp1.size();         // if list2 is bigger
        }

        if (inp1.get(0) == inp2.get(0)) {
            integerList.add(inp1.get(0));
            integerList.add(inp2.get(0));
//            throw new Exception("Incorect i/p");
        } else if (inp1.get(0) < inp2.get(0)) {
            integerList.add(inp1.get(0));
            integerList.add(inp2.get(0));
        } else {
            integerList.add(inp2.get(0));
            integerList.add(inp1.get(0));
        }

        for (int i = 1; i < n; i++) {
            if (inp1.get(i) >= inp2.get(i)) {
                integerList.add(inp2.get(i));
                integerList.add(inp1.get(i));
            } else {
                integerList.add(inp1.get(i));
                integerList.add(inp2.get(i));
            }
        }

        List<Integer> newList = new ArrayList<>();

        if (flag == false) {
            newList = inp2.subList(n, inp2.size());
        } else {
            newList = inp1.subList(n, inp1.size());
        }

        List<Integer> finalList = Stream.concat(integerList.stream(), newList.stream())
                .collect(Collectors.toList());

        return integerList;
    }
}

