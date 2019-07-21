package Study.TenToTwentyChapter.strings;

import java.util.regex.*;

public class ReFlags {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^java",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(
                "java has regex\nJava has regex\n" +
                      "JAVA has pretty good regular expression\n" +
                      "Regular expression are in Java");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
