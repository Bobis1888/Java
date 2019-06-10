package Study.FirstToTenChapter.TenChapter.BookTest.VeryBadClass;

class ArgumentsClass{
    protected String name;
    public ArgumentsClass(String name){
        this.name = name;
    }
    public void showString(){
        System.out.println(name);
    }
}
public class MyClass12 {
    public ArgumentsClass method(String name){
        return new ArgumentsClass(name){};
    }

    public static void main(String[] args) {
        MyClass12 myClass12 = new MyClass12();
        myClass12.method("Jon").showString();
    }
}
