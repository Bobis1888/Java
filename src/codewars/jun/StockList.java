package codewars.jun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String , Integer> map = new HashMap<>();
        boolean arrEmpty = true;
        for (String item : lstOf1stLetter) {
            map.put(String.valueOf(item.charAt(0)), 0);
        }
        for (String s : lstOfArt) {
            if (Arrays.asList(lstOf1stLetter).contains(String.valueOf(s.charAt(0)))) {
                String[] results = s.split(" ");
                String key = String.valueOf(results[0].charAt(0));
                Integer value = Integer.parseInt(results[1]);
                map.replace(key,value + map.get(key));
                arrEmpty = false;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lstOf1stLetter.length ; i++) {
            String key = String.valueOf(lstOf1stLetter[i].charAt(0));
            Integer value = map.get(key);
            String str = "(" + key + " : " + value + ")";
            result.append(str);
            if (!(i + 1 == lstOf1stLetter.length)){
                result.append(" - ");
            }
        }
        if (arrEmpty)
            return "<[]>";
        else
            return String.valueOf(result);
    }
    public static void main(String[] args) {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"F"};
        String expected = "(A : 200) - (B : 1140)";
        System.out.println(stockSummary(art,cd));
        System.out.println("Test : "  + expected.equals(stockSummary(art,cd)));
    }
}
