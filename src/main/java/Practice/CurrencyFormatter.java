package Practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {

    static List<ExchangeRate> exchangeRates = new ArrayList<ExchangeRate>();
    static Double db = null;
    static Double currVal = null;
    static String chkStr = null;

    static {
        exchangeRates.add(new ExchangeRate("USD", "INR", 54.18));
        exchangeRates.add(new ExchangeRate("JPY", "INR", 45.13));
        exchangeRates.add(new ExchangeRate("CNY", "INR", 50.16));
        exchangeRates.add(new ExchangeRate("FR", "INR", 61.16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        double payment = scanner.nextDouble();
        scanner.close();

        //Adding feature to write currency with payment received is in INR


        for (int i = 0; i < exchangeRates.size(); i++) {
            if (exchangeRates.get(i).toString().contains("USD")) {
                chkStr = exchangeRates.get(i).toString();
                currVal = getFinalAmount(chkStr, payment);
                System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(currVal));
            } else if (exchangeRates.get(i).toString().contains("JPY")) {
                chkStr = exchangeRates.get(i).toString();
                currVal = getFinalAmount(chkStr, payment);
                System.out.println("JAPAN: " + NumberFormat.getCurrencyInstance(Locale.JAPAN).format(currVal));
            } else if (exchangeRates.get(i).toString().contains("CNY")) {
                chkStr = exchangeRates.get(i).toString();
                currVal = getFinalAmount(chkStr, payment);
                System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(currVal));
            } else if (exchangeRates.get(i).toString().contains("FR")) {
                chkStr = exchangeRates.get(i).toString();
                currVal = getFinalAmount(chkStr, payment);
                System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(currVal));
            }
        }

        // Write your code here.
        System.out.println();
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }

    public static Double getFinalAmount(String chkStr, Double payment) {
        String arr[] = chkStr.split(":");
        db = new Double(arr[1]);
        currVal = payment / db;
        return currVal;
    }
}

class ExchangeRate {

    String targetCurrency;
    String baseCurrency;
    double rate;

    public ExchangeRate(String targetCurrency, String baseCurrency, double rate) {
        this.targetCurrency = targetCurrency;
        this.baseCurrency = baseCurrency;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return targetCurrency + "-" + baseCurrency + ":" + rate;
    }
}

