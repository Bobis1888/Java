package codewars.jun;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        if (arr.size() == 0)
            return 0;
        String pattern = "^[:;][-~]?[D)]$";
        int counter = 0;
        for (String s:arr) {
            Matcher matcher = Pattern.compile(pattern).matcher(s);
            if (matcher.find()){
             counter++;
            }
        }
        return counter;
    }
}
