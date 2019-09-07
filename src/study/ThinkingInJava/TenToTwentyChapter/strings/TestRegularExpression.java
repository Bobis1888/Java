package study.ThinkingInJava.TenToTwentyChapter.strings;

import java.util.regex.*;

public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression " + "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for (String arg: args){
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()){
                System.out.println("Match\"" + m.group() + "\" at position " + m.start() + "-" + (m.end() -1));
            }
        }
    }

}
//run>edit config>application>program argument { abcabcabcabcafbcadbc "abc+" "(abc)+" "(abc){2,}" }