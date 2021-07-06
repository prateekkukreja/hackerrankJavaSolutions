package JavaPrograms;

import java.util.Arrays;

public class DshareMaxSumAfterPartitioning {

    public static void main(String[] args) {
        int[] arr = {1, -2,  -3,  2,  1};
        System.out.println(maxSumAfterPartitioning(arr, 3));
    }

    public static double maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return solve(0, arr.length - 1, arr, k, dp);

    }

    public static double solve(int start, int end, int[] arr, int k, int[] dp) {
        int val = solveforOdd(start, end, arr, k, dp);
        int val1 = solveforEven(start + 1, end, arr, k, dp);
        Double dbl = Double.valueOf(val - val1);
        return dbl;
    }

    public static int solveforEven(int start, int end, int[] arr, int k, int[] dp) {
        if (start > end) {
            return 0;
        }

        if (dp[start] != -1) {
            return dp[start];
        }
        int min = arr[start];
        int ans = Integer.MIN_VALUE;
        for (int i = start; i < start + k && i < end; i = i + 2) {
            min = Math.min(arr[i], min);
            //division
//            int multiple = (i - start + 1);
//            int temp = multiple * min;
            int x = min + solveforEven(i + 1, end, arr, k, dp);
            ans = Math.min(ans, x);
//            System.out.println(start);
//            System.out.println(end);
        }
        return dp[start] = ans;
    }

    public static int solveforOdd(int start, int end, int[] arr, int k, int[] dp) {
        if (start > end) {
            return 0;
        }

        if (dp[start] != -1) {
            return dp[start];
        }
        int max = arr[start];
        int ans = Integer.MIN_VALUE;
        for (int i = start; i < start + k && i <= end; i = i + 2) {
            max = Math.max(arr[i], max);
            //division
//            int multiple = (i - start + 1);
//            int temp = multiple * max;
            int x = max + solveforOdd(i + 1, end, arr, k, dp);
            ans = Math.max(ans, x);
//            System.out.println(start);
//            System.out.println(end);
        }
//        System.out.println(ans);
        return dp[start] = ans;
    }

}
