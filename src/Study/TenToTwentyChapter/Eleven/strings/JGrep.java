package Study.TenToTwentyChapter.Eleven.strings;


import java.util.regex.*;

public class JGrep {
    public static void main(String[] args) throws Exception {
        Pattern p = Pattern.compile("\\b[Ssct]\\w+",Pattern.CASE_INSENSITIVE);
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new net.mindview.util.TextFile(args[0])){
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }
}
