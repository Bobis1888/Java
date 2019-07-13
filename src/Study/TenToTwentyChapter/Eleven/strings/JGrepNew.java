package Study.TenToTwentyChapter.Eleven.strings;

import java.util.*;
import java.util.regex.*;

public class JGrepNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "src/Study/TenToTwentyChapter/Eleven/strings/";
        String scannerString = string + scanner.nextLine() + ".java";
        args[0] = scannerString;
        System.out.println(args[0]);
        Pattern pattern = Pattern.compile("\".+?\"");
        Matcher m = pattern.matcher("");
        for (String line : new net.mindview.util.TextFile(args[0])){
            m.reset(line);
            while (m.find())
                System.out.println("Found: "+ m.start() + " " + m.group());
        }
    }
}
// "aw
// "ae"
// "as""
// ar