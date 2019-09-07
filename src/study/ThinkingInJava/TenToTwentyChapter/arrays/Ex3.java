package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.*;

public class Ex3 {

    public static double[][][] setA(int size1, int size2,int size3,double max,double min){
        Random random = new Random();
        double[][][] a = new double[size1][size2][size3];
        for (int i = 0; i < a.length ; i++) {
            for (int x = 0; x < a[i].length ; x++) {
                for (int j = 0; j < a[x].length; j++) {
                    while (a[i][x][j] == 0) {
                        double x1 = random.nextDouble() * 10;
                        if (x1 <= max && x1 >= min) {
                            a[i][x][j] = x1;
                        }
                    }
                }
            }
        }
        return a;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(setA(2, 2,3, 10, 2)));
    }
}
