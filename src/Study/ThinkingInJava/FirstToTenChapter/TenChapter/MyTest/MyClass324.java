package Study.ThinkingInJava.FirstToTenChapter.TenChapter.MyTest;

public class MyClass324 {
    MyClass324(){
        System.out.println("324");
    }
    private static class MyClass323{
        MyClass323(){
            System.out.println("323");
        }
       private static class MyClass322{
           MyClass322(){
               System.out.println("322");
           }
       }
    }

    public static void main(String[] args) {
        MyClass324 first = new MyClass324();
        MyClass323 second = new MyClass323();
        MyClass323.MyClass322 third = new MyClass323.MyClass322();
    }
}
