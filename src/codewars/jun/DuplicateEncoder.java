package codewars.jun;

import java.util.HashMap;

public class DuplicateEncoder {
    private static String encode(String word){
        word = word.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        int buff = 0;
        for (int i = 0; i < word.length() ; i++) {
            if (map.containsKey(word.charAt(i))){
                buff = map.get(word.charAt(i));
                map.put(word.charAt(i),++buff);
            } else {
                map.put(word.charAt(i),1);
            }
        }
        System.out.println(map);
        return word;
    }

    public static void main(String[] args) {
        encode("AADDFFcer");
    }
}
