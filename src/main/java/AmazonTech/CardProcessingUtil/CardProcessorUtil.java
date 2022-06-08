package AmazonTech.CardProcessingUtil;

/*
You are given a credit card number which needs to be send to a payment processor like Visa or MasterCard for authorization.
The processor associated with the credit card is determined by the BIN, the first 6 digits of the card number. You are given the following mapping:
```
BIN range    Processor
0000-299999    VISA
300000-499999    MasterCard
```
You are also given two libraries (SDKs), that should be used to integrate with the processors:
```
class VisaAuth {
public boolean auth(String creditCardNumber);
}
class MCAuth {
public boolean AuthCard(long creditCardNumber);
}
```
write a class/classes that allows a client to pass a credit card number, determines the processor to use and authorizes the card with the processor.

Think about all the aspects that are required for a production-ready code-base.
*/

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardProcessorUtil {

    static MasterCardAuth MCAuth = new MasterCardAuth();
    static VisaAuth VisaAuth = new VisaAuth();

    public static void main(String[] args) throws Exception {
        System.out.println(getCardProcessor(23561));
    }

    public static String getCardProcessor(Integer binValue) throws Exception {

        //    String cardProcessor = "";
        List<Integer> VisaRangeList = new ArrayList<>();
        List<Integer> MCRangeList = new ArrayList<>();

        VisaRangeList.add(0000);
        VisaRangeList.add(299999);

        MCRangeList.add(300000);
        MCRangeList.add(499999);

        HashMap<String, List<Integer>> BinRange = new HashMap<>();

        BinRange.put("VISA", VisaRangeList);
        BinRange.put("MasterCard", MCRangeList);

        int val = BinRange.get("VISA").get(1);
        Long l = Long.valueOf(val);

        //check regEx
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Pattern p1 = Pattern.compile("[!@#$%^&*()]", Pattern.CASE_INSENSITIVE);
        Pattern p2 = Pattern.compile("(?<=\")[^\"]*(?=\"\\s|\"$)|[^\\s\"]+");
        Matcher m = p.matcher(String.valueOf(binValue));
        Matcher m1 = p1.matcher(String.valueOf(binValue));
        Matcher m2 = p2.matcher(String.valueOf(binValue));
        boolean b = m.find();
        boolean b1 = m1.find();
        boolean b2 = m2.find();

        if (b == false || b1 == false || b2 == false) {
            throw new Exception("Invalid Input !!! ");
        }
        String processor = "";
        //core login if else
        if (binValue < BinRange.get("VISA").get(0)) {
            throw new Exception("Input below the range");
        } else if (binValue > BinRange.get("VISA").get(1)) {
            //mastercard auth method
            MCAuth.AuthCard(binValue);
            processor = Cards.MasterCard.toString();
        } else if ((binValue <= BinRange.get("VISA").get(1))) {
            //VISA auth method
            VisaAuth.auth(String.valueOf(binValue));
            processor = Cards.VISA.toString();
        } else if (binValue > BinRange.get("MasterCard").get(1)) {
            throw new Exception("Input above the range");
        }
        return processor;
    }
}