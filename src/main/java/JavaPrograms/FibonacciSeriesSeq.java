package JavaPrograms;

import java.util.Arrays;
//import java.util.Scanner;

public class FibonacciSeriesSeq {

    public static void main(String[] args) {
        //Scanner code for input
//        Scanner scan = new Scanner(System.in);

        try {
//            System.out.println("Enter series length : ");
//            int n = scan.nextInt();            //commenting and taking fixed int input
            int n = 10;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fibonacci(i + 1);
            }
            //Print original fibonacci series
//            System.out.println(Arrays.toString(arr));

            int[] arrNew = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 || i == 1) {
                    arrNew[i] = 1;
                } else {
                    arrNew[i] = arr[i] * arrNew[i - 1];
                }
            }
            //Print new series
            System.out.println(Arrays.toString(arrNew));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}