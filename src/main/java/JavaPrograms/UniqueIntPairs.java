package JavaPrograms;

import java.util.*;

public class UniqueIntPairs {

    public static void main(String[] args) {
        int[] arr = {1, 1, 15, 10, 20, 5, 4, 23, 2, 25, 18, 7, 16, 25, 0};
        int k = 25;

        Set<List<int[]>> list = getPairs(arr, k);
        Iterator<List<int[]>> iter = list.iterator();
        while (iter.hasNext()) {
//            System.out.println(Arrays.toString(iter.next().ite));
        }
    }

    public static Set<List<int[]>> getPairs(int[] arr, int k) {

        Arrays.sort(arr);
        Set<List<int[]>> outerlist = new HashSet<>();
        int i = 0;
        int j = arr.length - 1;
        int[] arr1 = null;

        while (i < j) {
            if (arr[i] + arr[j] == k) {
                while (i < j && arr[i] == arr[i + 1]) {
                    i++;
                }
                while (i < j && arr[j] == arr[j - 1]) {
                    j--;
                }
                arr1 = new int[2];
                arr1[0] = arr[i];
                arr1[1] = arr[j];
                i++;
                j--;
            } else if (arr[i] + arr[j] < k) {
                i++;
            } else {
                j--;
            }
            outerlist.add(Arrays.asList(arr1));
        }
        return outerlist;
    }
}