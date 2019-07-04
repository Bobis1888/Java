package Study.TenToTwentyChapter.Eleven.exceptions;

class VeryImportantException extends Exception{
    public String toString(){
        return "Very Important exception!!!";
    }
}
class HohumException extends Exception{
    public String toString(){
        return "Secondary Exception";
    }
}
class ThreesException extends Exception{
    public String toString(){
        return "Three Exception";
    }
}
public class LostMessage {
    void f()throws VeryImportantException{
        throw new VeryImportantException();
    }
    void dispose() throws HohumException{
        throw new HohumException();
    }
    void g()throws ThreesException{
        throw new ThreesException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                    lm.dispose();
                }finally {
                    lm.g();
                }

        }catch (Exception e) {
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

