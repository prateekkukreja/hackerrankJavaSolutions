package AmazonTech.TypeConverter;

//print Money Amounts in Words
//	Input -  924.6
//	Output - nine hundred twenty four dollars and sixty cents

// Input = 1001
// Output = "Invalid number"

import java.util.Arrays;

public class IntegerToString {

    public String getStringOfInt(String numVal) throws Exception {

        String[] unitsArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tensArray = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        int num = Integer.parseInt(numVal);

        try {
            String getVal = String.valueOf(num);
            String[] getArr = getVal.split(".");

            System.out.println(Integer.valueOf(getArr[1]));

        } catch (Exception e) {
            e.printStackTrace();
        }

        String words = "";

        if (num == 0) {
            return "zero";
        }

        if (num > 1000) {
            return "Invalid number";
        }

        if (num == 1000) {
            return "One Thousand";
        }

        //for negative balance like   -924.6
        if (num < 0) {
            String number = " " + num;
            number = number.substring(1);
            return "minus" + getStringOfInt(number);
        }

        // if ((num / 1000) > 0){
        //    words += getStringOfInt(num / 1000) + " thousand ";
        //   number %= 1000;
        if ((num / 100) > 0) {
            words += getStringOfInt(String.valueOf(num / 100)) + " hundred ";
            num %= 100;
        }

        if (num > 0) {
            if (num < 10) {
                words += unitsArray[num];
            } else {
                words += tensArray[num / 10];
                if ((num % 10) > 0) {
                    words += unitsArray[num % 10];
                }
            }
        }

        //for decimal array
        int getDecimalVal = 0;

        try {
            String[] splitter = String.valueOf(num).split("\\.");
            getDecimalVal = Integer.valueOf(splitter[1]);
        } catch (NullPointerException e) {
            throw new Exception("No decimal value");
        }

        words += unitsArray[getDecimalVal] + " cents";
        return words;
    }
}

