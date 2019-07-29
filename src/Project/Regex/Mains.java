package Project.Regex;

import java.util.regex.*;

public class Mains {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("<.+?>");
        Matcher m = p.matcher("<asd>asasd<asd> asdasd <asdasd>");

        while (m.find()){

            System.out.println(m.start() + " " + m.group() + " ");

        }
    }
}
