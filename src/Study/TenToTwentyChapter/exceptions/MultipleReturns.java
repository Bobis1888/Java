package Study.TenToTwentyChapter.exceptions;

public class MultipleReturns {
    public static void f(int i){
        System.out.println("Initialization, requiring completion");
        try {
            if (i == 1){
                System.out.println("Dot " + i);
                return;
            }
            if (i == 2){
                System.out.println("Dot " + i);
                return;
            }
            if (i == 3){
                System.out.println("Dot " + i);
                return;
            }
        }finally {
            System.out.println("Final actions");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 4 ; i++) {
            f(i);
        }
    }
}
