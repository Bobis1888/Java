package study.ThinkingInJava.TenToTwentyChapter.arrays;


import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<ArrayList<String>> listsArray = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            listsArray.add(new ArrayList<>());
            for (int j = 0; j < 10 ; j++) {
                listsArray.get(i).add(String.valueOf(i));
            }
        }
        System.out.println(listsArray);
    }
}
