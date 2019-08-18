package Algoritm.Finder;

import Study.net.mindview.util.TextFile;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinderAny {
    public static void main(String[] args) {
        File dir = new File("/home/bobis1888/Git/Java/src/Algoritm");
        if (dir.isDirectory()){
            for (File file : dir.listFiles()){
                if (file.isDirectory()){
                    System.out.println(file.getName() + "\t folder");
                }else {
                    System.out.println(file.getName() + "\t file");
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter path of file: src/");
        String scannerString = scanner.nextLine() + ".java";
        args = new String[]{"src/" + scannerString};
        System.out.println(args[0]);
        System.out.println("Please enter RegEx:");
        String scannerString2 = scanner.nextLine();
        Pattern pattern = Pattern.compile(scannerString2);
        Matcher m = pattern.matcher("");
        for (String line : new TextFile(args[0])){
            m.reset(line);
            while (m.find())
                System.out.println("Found: " + m.group() + " " + m.start());
        }
    }
}
//aw
//ae
//as
//ar