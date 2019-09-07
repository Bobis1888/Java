package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.*;

public class RaggedArray {
    public static void main(String[] args) {
        Random random = new Random();
        int [][][] a = new int[random.nextInt(7)][][];
        for (int i = 0; i < a.length ; i++) {
            a[i] = new int[random.nextInt(5)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int[random.nextInt(5)];
                for (int k = 0; k <a[i][j].length ; k++) {
                    a[i][j][k] = random.nextInt(10);
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
