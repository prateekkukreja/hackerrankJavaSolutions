package JavaPrograms;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CompareMapKeyAndValues {

    static Map<LocalDate, HashMap<String, LocalDate>> map = new TreeMap<>();

    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date input :: ");
        String input = scan.next();
        LocalDate inp = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        map = mergeDates();
        if (map.containsKey(inp)) {
            System.out.println(map.get(inp));
        } else {
            System.out.println("No data for given date");
        }
    }

    public static Map<LocalDate, HashMap<String, LocalDate>> mergeDates() {

        Map<String, String> sedan = getSedanData();
        for (Map.Entry<String, String> set : sedan.entrySet()) {
            LocalDate keyDate = LocalDate.parse(set.getKey(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate valDate = LocalDate.parse(set.getValue(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            HashMap<String, LocalDate> temp = new HashMap<>();
            temp.put("sedan", valDate);
            if (map.containsKey(keyDate)) {
                HashMap<String, LocalDate> existingVal = map.get(keyDate);
                temp.put("hatchback", existingVal.get("hatchback"));
            }
            map.put(keyDate, temp);
        }

        Map<String, String> hatchBack = getHatchBackData();
        for (Map.Entry<String, String> set : hatchBack.entrySet()) {
            LocalDate keyDate = LocalDate.parse(set.getKey(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate valDate = LocalDate.parse(set.getValue(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            HashMap<String, LocalDate> temp = new HashMap<>();
            temp.put("hatchback", valDate);
            if (map.containsKey(keyDate)) {
                HashMap<String, LocalDate> existingVal = map.get(keyDate);
                temp.put("sedan", existingVal.get("sedan"));
            }
            map.put(keyDate, temp);
        }
//        System.out.println(map);
        return map;
    }

    public static HashMap<String, String> getHatchBackData() {

        HashMap<String, String> hatchback = new HashMap<>();
        hatchback.put("2020-02-03", "2020-03-04");
        hatchback.put("2020-03-04", "2020-04-02");
        hatchback.put("2020-04-02", "2020-05-04");
        hatchback.put("2020-05-04", "2020-06-03");
        hatchback.put("2020-06-03", "2020-07-05");
        hatchback.put("2020-07-05", "2020-08-03");
        hatchback.put("2020-08-03", "2020-09-01");
        hatchback.put("2020-09-01", "2020-10-01");
        hatchback.put("2020-10-01", "2020-11-01");
        hatchback.put("2020-11-01", "2020-12-02");
        hatchback.put("2020-12-02", "2021-01-05");
        hatchback.put("2021-01-05", "2021-02-03");
        hatchback.put("2021-02-03", "2021-03-04");
        hatchback.put("2021-03-04", "2021-04-04");
        hatchback.put("2021-04-04", "2021-05-03");

        return hatchback;
    }

    public static Map<String, String> getSedanData() {

        HashMap<String, String> sedan = new HashMap<>();
        sedan.put("2020-02-03", "2020-03-05");
        sedan.put("2020-03-06", "2020-04-03");
        sedan.put("2020-04-01", "2020-05-04");
        sedan.put("2020-05-04", "2020-06-02");
        sedan.put("2020-06-01", "2020-07-03");
        sedan.put("2020-07-03", "2020-08-06");
        sedan.put("2020-08-05", "2020-09-01");
        sedan.put("2020-09-03", "2020-10-01");
        sedan.put("2020-10-01", "2020-11-03");
        sedan.put("2020-11-02", "2020-12-03");
        sedan.put("2020-12-04", "2021-01-03");
        sedan.put("2021-01-02", "2021-02-03");
        sedan.put("2021-02-05", "2021-03-02");
        sedan.put("2021-03-02", "2021-04-05");
        sedan.put("2021-04-03", "2021-05-04");

        return sedan;
    }

}

