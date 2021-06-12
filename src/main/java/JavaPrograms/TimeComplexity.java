package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class TimeComplexity {

    public static void main(String[] args) {

        BigO1();
        BigOn();
        BigOn2();
        BigOn3();

    }

    private static void BigOn3() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println(i + " " + j + " " + k + " ");
                }
                System.out.println();
            }
        }
    }

    private static void BigOn2() {

        //O(n^2)
        //n^2 + n + 1
        //2n^2 + 2n + 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j + " ");
            }
            System.out.println();
        }
    }

    public static void BigO1() {

        int n = 1;
        System.out.println(n);

        //odd/even number passing input ( no for loop )
        int num = 123;
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        Map<String, Integer> marks = new HashMap<>();
        marks.put("a", 1);
        marks.put("b", 8);

        System.out.println(marks.get("b"));
    }

    public static void BigOn() {

        int n1 = 10;
        for (int i = 0; i <= n1; i++) {
            System.out.println(i);
        }

        // O(n)
        int arr[] = {2, 54, 56, 3, 2, 56, 88, 98};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }


}
