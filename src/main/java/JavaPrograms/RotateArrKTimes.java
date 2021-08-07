package JavaPrograms;

import java.util.Scanner;

public class RotateArrKTimes {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rotation count : ");
        int k = scan.nextInt();

        rotateArray(arr, k);
    }

    public static void rotateArray(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                System.out.println(arr[arr.length + i - k] + " ");
            } else {
                System.out.println(arr[i + k] + " ");
            }
        }

        System.out.println();

    }

}
