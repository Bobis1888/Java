package Study.TenToTwentyChapter.exceptions;

class DisposeClass{
    private static int counter = 1;
    private final int id = counter++;
    public void dispose(){
        System.out.println("Dispose.dispose() " + id);
    }
}

class FCException extends Exception{}

class FailingConstruction {
    DisposeClass disposeClass;
    DisposeClass disposeClass2;
    public void dispose(){
        System.out.println("FC dispose()");
    }
    FailingConstruction()throws FCException {
        disposeClass = new DisposeClass();
        try {
            throw new FCException();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
        disposeClass2 = new DisposeClass();
        disposeClass2.dispose();
    }
}
public class Ex22 {
    public static void main(String[] args) {
        try {
            FailingConstruction fc = new FailingConstruction();
            fc.dispose();
        }catch (FCException e){
            e.printStackTrace(System.err);
        }
    }
}
