package Study.TenToTwentyChapter.Eleven.strings;

import java.util.regex.*;

public class Ex11 {
        public static void main(String[] args) {
            if (args.length<2){
                System.out.println("Usage: \n java TestRegularExpression " + "characterSequence regularExpression+");
                System.exit(0);
            }
            System.out.println("Input: \"" + args[0] + "\"");
            for (String arg: args){
                System.out.println("RegularExpression: \"" + arg + "\"");
                Pattern p = Pattern.compile(arg);
                Matcher m = p.matcher(args[0]);
                if (!m.find()){
                    System.out.println("No match found for " + "\"" + arg + "\"");

                }
                m.reset();
                while (m.find()){
                    System.out.println("Match \"" + m.group() +
                            "\" at position " + m.start() + ((m.end() - m.start() < 2) ? "" : ("-" + (m.end() - 1))));
                }
            }
        }
    }
//run>edit config>application>program argument { "Arline ate eight apples and one orange while Anita hadn't any" (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b }

