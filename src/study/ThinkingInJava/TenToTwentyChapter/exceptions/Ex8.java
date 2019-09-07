package study.ThinkingInJava.TenToTwentyChapter.exceptions;

public class Ex8 {
    public static void f() throws Ex4{
        System.out.println(" Created Ex4. ");
        throw new Ex4("Ex4 is Run");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (Ex4 e){
            e.printStackTrace(System.err);
        }
    }
}
