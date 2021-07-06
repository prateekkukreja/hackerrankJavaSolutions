package JavaPrograms;

import java.util.*;

public class EeshGetSmallestNegativeBalance {

    public static void main(String[] args) {
        List<List<String>> debts = new ArrayList<>();
        getSmallestNegativeBalance(debts);
    }

    public static List getSmallestNegativeBalance(List<List<String>> debts) {

        Map<String, int[]> map = new HashMap<>();

        for (List<String> list : debts) {
            String borrower = list.get(0);
            String lender = list.get(1);
            int amount = Integer.parseInt(list.get(2));
            int[] borrowerBal = map.getOrDefault(borrower, new int[]{0, 0, 0});
            borrowerBal[0] += amount;
            map.put(borrower, borrowerBal);
            int[] lenderBal = map.getOrDefault(lender, new int[]{0, 0, 0});
            lenderBal[1] += amount;
            map.put(lender, lenderBal);
        }
        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            int[] bal = entry.getValue();
            bal[2] = bal[1] - bal[0];
            map.put(entry.getKey(), bal);
        }

//        Comparator<String> comparator = new StringLengthComparator();
//        PriorityQueue<String> pq = new PriorityQueue<String>(10, comparator);

        PriorityQueue pq = new PriorityQueue<String>(
                (a, b) -> map.get(a)[2] == map.get(b)[2] ? a.compareTo(b) : map.get(a)[2] - map.get(b)[2]);

        for (String key : map.keySet()) {
            pq.add(key);
        }

        List<String> res = new ArrayList<>();
        int min = 0;
        while (!pq.isEmpty()) {
            String person = (String) pq.poll();
            int[] balance = map.get(person);

            if (balance[2] >= 0)
                return res;
            if (min >= balance[2]) {
                min = balance[2];
                res.add(person);
            }
        }

        if (res.size() >= 1)
            return res;
        else
            res.add("no one is in debt");
        return res;
    }
}
