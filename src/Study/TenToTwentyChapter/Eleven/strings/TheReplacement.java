package Study.TenToTwentyChapter.Eleven.strings;

import java.util.regex.*;

public class TheReplacement {
    public static void main(String[] args) {
        String s = "/*Here's block of text to use as input to" +
                "the regular expression matcher. Note that we'll" +
                "first extract the block of text by looking for" +
                "the special delimiters, then process the " +
                "extracted block.!*/";
        Matcher input = Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(s);
        while (input.find()){
            s = input.group(1);
        }
        s = s.replaceAll(" {2,} "," ");
        s = s.replaceAll("(?m)^ +","");
        System.out.println(s);
        s = s.replaceFirst("[aeiou]","(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while(m.find()){
            m.appendReplacement(sbuf,m.group().toUpperCase());
        }
        m.appendTail(sbuf);
        System.out.println(sbuf);
    }
}
