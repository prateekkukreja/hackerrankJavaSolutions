package Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    //        static Scanner in = new Scanner(System.in);
    public static String findDay(int month, int day, int year) {
        String dayOfWeek = null;
        //String month = in.next();
        int mm = month;
        //String day = in.next();
        int dd = day;
        //String year = in.next();
        int yy = year;
//        in.close();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        return dt.getDayOfWeek().toString();
    }
}

public class JavaDateTime {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Month : ");
        int month = in.nextInt();
        System.out.println("Enter Day : ");
        int day = in.nextInt();
        System.out.println("Enter year : ");
        int year = in.nextInt();

        String res = Result.findDay(month, day, year);
        System.out.println(res);
        in.close();
    }
}
