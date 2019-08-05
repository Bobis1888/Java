package codewars.jun;

public class PredictYourAge {
    private static void pOp(int[] i){
        for (int j = 0; j < i.length ; j++) {
            i[j]*=i[j];
        }
    }
    public static int predict(int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8){
        int summ = 0;
        int[] ints = {a1,a2,a3,a4,a5,a6,a7,a8};
        pOp(ints);
        for (int i : ints) {
            summ += i;
        }
        summ = (int) Math.sqrt(summ)/2;
        return summ;
    }

    public static void main(String[] args) {
        System.out.println(predict(65, 60, 75, 55, 60, 63, 64, 45));
    }
}
