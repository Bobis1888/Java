package Algoritm.Finder;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {
       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter path of file: ...Java/src/");
        String scannerString = scanner.nextLine() + ".java";
        args = new String[]{"src/" + scannerString};
        System.out.println(args[0]);
           System.out.println("Please enter RegEx:");
        String scannerString2 = scanner.nextLine();
        Pattern pattern = Pattern.compile(scannerString2);
        Matcher m = pattern.matcher("");
        for (String line : new net.mindview.util.TextFile(args[0])){
            m.reset(line);
            while (m.find())
                System.out.println("Found in position " + m.start() + " " + m.group());
        }
    }
}
//aw
//ae
//as
//ar