package study.ThinkingInJava.TenToTwentyChapter.exceptions;

public class Ex27 {
    static int [] ints = new int[3];

    public static void main(String[] args) {
        try {
            ints[4] = 1;
        }catch (ArrayIndexOutOfBoundsException e){
            try{
            throw new RuntimeException(e);
        }catch (RuntimeException r){
                System.out.println(r);
            }
        }
        System.out.println("SSS");
    }
}
