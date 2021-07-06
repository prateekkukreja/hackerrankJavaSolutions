package JavaPrograms;

import java.util.*;

public class EeshPriorityQueue {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(test(numbers, q));
//        System.out.println(test1(numbers, q));
    }

    public static List<Integer> test1(List<Integer> arr, List<Integer> result) {
        try {
            for (int i = 0; i < arr.size(); i++) {
                Map<Integer, Integer> frequencies = new HashMap<>();
                int max = -1;
                for (int j = 0; j < arr.size(); j++) {
                    if (!frequencies.containsKey(arr.get(i))) {
                        frequencies.put(arr.get(i), 1);
                    }
                    max = Math.max(arr.get(i), max);
                }
                result.add(frequencies.get(max));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public static List<Integer> test(List<Integer> numbers, List<Integer> q) {

        Map<Integer, Integer> frequencies = new HashMap<>();
        Set<Integer> sortedValues = new TreeSet<>();
        Stack<Integer> maximums = new Stack<>();

        try {
            for (int i = 0; i < numbers.size(); i++) {
                if (!frequencies.containsKey(numbers.get(i))) {
                    frequencies.put(numbers.get(i), 1);
                    sortedValues.add(numbers.get(i));
                } else {
                    frequencies.put(numbers.get(i), frequencies.get(numbers.get(i) + 1));
                }
            }

            for (int num : sortedValues) {
                maximums.push(num);
            }

            for (int i = 0; i < numbers.size(); i++) {
                while (frequencies.get(maximums.peek()) == 0) {
                    maximums.pop();
                }
                q.add(frequencies.get(maximums.peek()));
                frequencies.put(numbers.get(i), frequencies.get(numbers.get(i)) - 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return q;
    }
}
