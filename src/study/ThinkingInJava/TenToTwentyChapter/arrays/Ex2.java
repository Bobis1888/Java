package study.ThinkingInJava.TenToTwentyChapter.arrays;

public class Ex2 {
    public static BerylliumSphere[] getBerylSphere(int size){
        return new BerylliumSphere[size];
    }

    public static void main(String[] args) {
        BerylliumSphere[] berylliumSpheres = getBerylSphere(10);
        for (int i = 0; i < 9 ; i++) {
            System.out.println(berylliumSpheres[i]);
        }
    }
}
