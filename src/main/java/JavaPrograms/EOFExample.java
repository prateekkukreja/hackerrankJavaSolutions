package JavaPrograms;

import java.util.Scanner;

public class EOFExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int i = 0;
        System.out.println("Enter input : ");
        while (scan.hasNext()) {
            i++;
            System.out.println(i + " " + scan.nextLine());
        }
        scan.close();
    }
}
