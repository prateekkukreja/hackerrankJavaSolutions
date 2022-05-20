package Arrays;

import java.util.*;

public class TwoSums {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        int i = -1;
        for (int val : nums) {
            i++;
            if (map.containsKey(target - val)) {
                res[0] = map.get(target - val);
                res[1] = i;
            } else {
                map.put(val, i);
            }
        }
        return res;
    }
}
