package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.Arrays;

class Atest{
    private int x;
    Atest(int x){
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().getSimpleName().equals("Atest") && ((Atest)obj).x == this.x;
    }
}

public class Ex19 {
    public static void main(String[] args) {
        Atest [] atests1 = new Atest[5];
        Atest [] atests2 = new Atest[5];
        Arrays.fill(atests1,new Atest(10));
        Arrays.fill(atests2,new Atest(11));
        System.out.println(Arrays.equals(atests1,atests2));
    }
}
