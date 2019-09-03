package Study.ThinkingInJava.TenToTwentyChapter.exceptions;

class OneException extends Exception{
    public OneException(String s){super(s);}
}
class TwoException extends Exception{
    public TwoException(String s){super(s);}
}
public class RethrowNew {
    public static void f() throws OneException{
        System.out.println("Created exception in f()");
        throw new OneException("Of f()");
    }

    public static void main(String[] args) {
        try{
            try {
                f();
            }catch (OneException e){
                System.out.println("Intercepted in inside block try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("Of inside block try");
            }
        }catch (TwoException e){
            System.out.println("Intercepted in outside block try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
