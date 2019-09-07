package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.Arrays;

public class Ex5 {
    public static BerylliumSphere[][][] setBerylSphere(int one,int two,int three){
        BerylliumSphere[][][] a = new BerylliumSphere[one][two][three];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(setBerylSphere(3,2,3)));
    }
}
