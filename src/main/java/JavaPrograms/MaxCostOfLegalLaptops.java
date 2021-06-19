package JavaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MaxCostOfLegalLaptops {

    public static void main(String[] args) {
        List<Integer> cost = new ArrayList<>();
        List<String> labels = new ArrayList<>();
        int dailyCount = 2;

        cost.add(31);
        cost.add(55);
        cost.add(22);
        cost.add(88);
        cost.add(76);
        cost.add(45);
        cost.add(90);
        cost.add(23);

        labels.add("legal");
        labels.add("illegal");
        labels.add("legal");
        labels.add("88");
        labels.add("legal");
        labels.add("illegal");
        labels.add("legal");
        labels.add("88");
        maxCost(cost, labels, dailyCount);
    }

    public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
        // Write your code here
//        int costPerDay = 0;
        int cnt = 0;

        if (labels.size() != cost.size()) {
            return 0;
        }

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < labels.size(); i++) {
            map.put(cost.get(i), labels.get(i));
        }

        int max = Integer.MIN_VALUE;
        int costPerDay = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            if (!entry.getValue().contains("legal")) {
                continue;
            }
            if (cnt < dailyCount) {
                costPerDay = costPerDay + entry.getKey();
            } else {
                cnt = 0;
                costPerDay = entry.getKey();
            }
            if (entry.getValue().equals("legal")) {
                cnt++;
            }
            if (costPerDay > max) {
                max = costPerDay;
            }
        }
        System.out.println(max);
        return max;
    }
}

