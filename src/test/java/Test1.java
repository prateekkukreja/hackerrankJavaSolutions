
import java.util.*;

//Topic: Chethan Manjunath's Zoom Meeting
//        Time: Jul 28, 2021 04:30 PM Mumbai, Kolkata, New Delhi
//
//        Join Zoom Meeting
//        https://disney.zoom.us/j/96155966658?pwd=Y2pNNHNmaWtOOW1vWUZjay9JQnE3Zz09
//
//        Meeting ID: 961 5596 6658
//        Passcode: 402465


/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.
 *******************************************************************************/

// * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
//  * <p>
//  * Note:
//  * The length of num is less than 10002 and will be ≥ k.
//  * The given num does not contain any leading zero.
//  * Example 1:
//  * <p>
//  * Input: num = "1,4,3,2,2,1,9", k = 3
//  * Output: "1219"
//  * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.


public class Test1 {

    static String out = "";

    public static void main(String[] args) {
        //	System.out.println("Hello World");

        String s = "1432219";
        // len = 4
        int k = 3;

        System.out.print(findMinNum(s, k));
    }


    public static String findMinNum(String a, int k) {

        checkLowest(a, k);

        if (out.length() > 0) {
            return out;
        } else {
            return "0";
        }
    }

    public static void checkLowest(String a, int k) {

//        int leng = a.length();
        int intMinIdx = 0;

//        if (k == 0)
//            out += a;
//        return;

//        if (leng <= k) {
//            return;
//        }

        for (int i = 1; i <= k; i++) { // k =3;
//            System.out.println(intMinIdx);
            if (a.charAt(i) < a.charAt(intMinIdx)) //&& a.charAt(i) != '0'
                intMinIdx = i;

//            System.out.println(a.charAt(intMinIdx));

            out += a.charAt(intMinIdx);
//            System.out.println(out);

//            String s = "140322190";
            //remaining part of String
            String outFinal = a.substring(intMinIdx + 1); // min+1, a.length()-1
//            System.out.println(outFinal);
            while (out.length() < a.length() - k) {
                checkLowest(outFinal, k - intMinIdx);
            }
        }
    }

}
