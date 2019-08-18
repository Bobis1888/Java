package codewars.jun;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
        private static int maxCount(Map<Character,Integer> map){
            int numberOfMatches = 0;
            for (Map.Entry<Character,Integer> entry:map.entrySet()){
                if (entry.getValue()>1)
                    numberOfMatches++;
            }
            return numberOfMatches;
        }
        public static int duplicateCount(String text) {
            text = text.toLowerCase();
            HashMap<Character,Integer> map = new HashMap<>();
            int count = 1;
            for (char c:text.toCharArray()) {
                for (int i = 0; i < text.length() ; i++)
                    if (c == text.charAt(i)) map.put(c,count++);

                count = 1;
            }
            return maxCount(map);
        }


    public static void main(String[] args) {
        System.out.println(duplicateCount("Indivisibilitie"));
    }
}