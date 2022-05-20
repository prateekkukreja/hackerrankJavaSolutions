package JavaPrograms;

public class YugaByte {

    public static void main(String[] args) {

        String str = "abc";
        test(str);
    }

    public static String test(String str1) {
        int length = str1.length();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        boolean flag = false;

        for (int i = 0; i < length; i++) {
            if (count > 1){
                flag = true;
            }
            if (i == length - 1 && count > 1 && flag) {
                sb.append(str1.charAt(i) + "" + count);
                break;
            } else if (i == length - 1) {
                sb.append(str1.charAt(i) + "");
                break;
            }  else if (i == length - 1 && flag) {
                sb.append(str1.charAt(i) + "" + count);
                break;
            }

            if (str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
            } else if (count > 1 && flag) {
                sb.append(str1.charAt(i) + "" + count);
                count = 1;
            } else if (flag) {
                sb.append(str1.charAt(i) + "" + count);
            }  else  {
                sb.append(str1.charAt(i) + "");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
//
//        int count = 1;
//        int mark = 0;
//        StringBuilder builder = new StringBuilder();
//        boolean flag = false;
//
//        for (int i = 1; i < str1.length(); i++) {
//            if (str1.charAt(i) == str1.charAt(i - 1) && i < str1.length() - 1 && flag) {
//                count++;
//                flag = true;
//            } else if (i == str1.length() - 1 && str1.charAt(i) == str1.charAt(i - 1) && flag) {
//                count++;
//                builder.append(str1.charAt(mark));
//                builder.append(count);
//                count = 1;
//                mark = i;
//                flag = true;
//            } else if (flag) {
//                builder.append(str1.charAt(mark));
//                builder.append(count);
//                count = 1;
//                mark = i;
//                flag = true;
//            } else if ( {
//                builder.append(str1.charAt(mark));
//                mark = i;
//            }
//        }
//        System.out.println(builder.toString());
//        return builder.toString();
//    }

}
