package Study.TenToTwentyChapter.Map;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String,Maps> mapsMap = new HashMap<>();
        mapsMap.put("cS6",new Maps());
        mapsMap.put("cS4",new Maps());
        mapsMap.put("cS3",new Maps());
        mapsMap.put("cS2",new Maps());
        mapsMap.put("cS5",new Maps());
        mapsMap.put("cS1",new Maps());
        System.out.println("HashMap :" + mapsMap);
        Set<String> sorteredKey = new LinkedHashSet<>(mapsMap.keySet());
        System.out.println("TreeSet :" + sorteredKey);
        Map<String,Maps> newMaps = new LinkedHashMap<>();
        for (String s:sorteredKey) {
            newMaps.put(s,mapsMap.get(s));
        }
        System.out.println(newMaps);
    }
}
