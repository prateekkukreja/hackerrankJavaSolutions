package JavaPrograms;

public class BuySellShares {

    public static int maxRet = 0;

    public static void main(String[] args) {


        int[] arr = {100, 180, 260, 310, 40, 535, 695};
//        System.out.println(bruteForce(arr));
        int n = arr.length;
        System.out.println(maxProfit(arr, 0, n - 1));
//        System.out.println(bestSolution(arr));
    }

    public static int bruteForce(int[] arr) {

        int maxProfit = Integer.MIN_VALUE;
        int lowestPrice = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lowestPrice) {
                int profit = arr[i] - lowestPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                lowestPrice = arr[i];
            }
        }
        return maxProfit;
    }

    static int maxProfit(int price[], int start, int end) {

        // If the stocks can't be bought
        if (end <= start)
            return 0;

        // Initialise the profit
        int profit = 0;

        // The day at which the stock
        // must be bought
        for (int i = start; i < end; i++) {

            // The day at which the
            // stock must be sold
            for (int j = i + 1; j <= end; j++) {

                // If byuing the stock at ith day and
                // selling it at jth day is profitable
                if (price[j] > price[i]) {

                    // Update the current profit
                    int curr_profit = price[j] - price[i]
                            + maxProfit(price, start, i - 1)
                            + maxProfit(price, j + 1, end);
                    System.out.println(curr_profit);
                    // Update the maximum profit so far
                    profit = Math.max(profit, curr_profit);
                    System.out.println(profit);
                }
            }
        }
        return profit;
    }

    static int bestSolution(int[] arr) {

        int maxProfit = 0;
        int minSofar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            minSofar = Math.min(minSofar, arr[i]);
            int profit = arr[i] - minSofar;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

}
