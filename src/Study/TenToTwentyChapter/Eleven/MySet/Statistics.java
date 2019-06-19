package Study.TenToTwentyChapter.Eleven.MySet;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 10000 ; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r,freq == null ? 1 : freq + 1 );
        }
        System.out.println(map);
    }
}
