package Study.TenToTwentyChapter.Eleven.exceptions;

class FourException extends Exception{}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Enter in first block try");
        try {
            System.out.println("Enter in second block try");
            try {
                throw new FourException();
            }finally {
                System.out.println("Finally in second block try");
            }
        }catch (FourException e){
            System.out.println("Intercepted FourException in first block try");
        }finally {
            System.out.println("Finally in first block try");
        }
    }
}
