package codewars.jun;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata{
    private static Map<Character,Integer> ASCIIMaps = new HashMap<>();
    private static int getCodeASCII(Character key){
        ASCIIMaps.put('A',65);        ASCIIMaps.put('N',78);
        ASCIIMaps.put('B',66);        ASCIIMaps.put('O',79);
        ASCIIMaps.put('C',67);        ASCIIMaps.put('P',80);
        ASCIIMaps.put('D',68);        ASCIIMaps.put('Q',81);
        ASCIIMaps.put('E',69);        ASCIIMaps.put('R',82);
        ASCIIMaps.put('F',70);        ASCIIMaps.put('S',83);
        ASCIIMaps.put('G',71);        ASCIIMaps.put('T',84);
        ASCIIMaps.put('H',72);        ASCIIMaps.put('U',85);
        ASCIIMaps.put('I',73);        ASCIIMaps.put('V',86);
        ASCIIMaps.put('J',74);        ASCIIMaps.put('W',87);
        ASCIIMaps.put('K',75);        ASCIIMaps.put('X',88);
        ASCIIMaps.put('L',76);        ASCIIMaps.put('Y',89);
        ASCIIMaps.put('M',77);        ASCIIMaps.put('Z',90);
        return ASCIIMaps.get(key);
    }

        private static String validCompare(String s){
            if (s == null){
                return ""; }
            s = s.toUpperCase();
            Pattern pattern = Pattern.compile("[^A-Z]");
            Matcher matcher1 = pattern.matcher(s);
            if (matcher1.find() || s.equals("NULL") || s.equals("Nil") || s.equals("None"))
                s = "";
            return s;  }
        private static int intCodeASCII(String st){
            int summCode = 0;
            if (st.length()>0) {
                char[] chars = st.toCharArray();
                for (char c:chars) {  summCode+=getCodeASCII(c);   }
                return summCode;
            }else {  return summCode;   }
        }
    private static boolean compare(String s1, String s2){
        s1 = validCompare(s1);
        s2 = validCompare(s2);
        int integerS1 = intCodeASCII(s1);
        int integerS2 = intCodeASCII(s2);
        return integerS1==integerS2;
    }
    }

