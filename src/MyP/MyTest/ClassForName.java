package MyP.MyTest;

class Test{
    static {
        System.out.println("Test is Run");
    }
}

public class ClassForName {
    public static void main(String[] args) throws Exception{
        Class.forName("MyP.MyTest.Test");
    }
}

