package JavaPrograms;

import java.util.Scanner;

public class StringDelimiter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input string : ");
        String s = scan.nextLine();
        // Write your code here.
        String delims = "[ .,?!']+";
        String[] tokens = s.split(delims);
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        scan.close();
    }
}
