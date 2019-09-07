package study.ThinkingInJava.TenToTwentyChapter.exceptions;

class ExceptionOne extends Exception{
    ExceptionOne(String msg){super(msg);}
}
class ExceptionTwo extends Exception{
    ExceptionTwo(String msg){super(msg);}
}
public class Ex10 {
    public static void f(){
        try {
            try {
                g();
            }catch (ExceptionOne e){
                e.printStackTrace(System.out);
                System.out.println("Intercepted in inside block");
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            e.printStackTrace(System.out);
            System.out.println("Intercepted in outside block");
        }
    }
    public static void g() throws ExceptionOne{
        throw new ExceptionOne("Created in g()");
    }

    public static void main(String[] args) {
        f();
    }
}
