package Study.FirstToTenChapter.TenChapter.BookTest.NestedClass;

interface MyInterface45{
    String say();
    String doSomething();
    class MyNestedClass{
            static void goDoit(MyInterface45 i){
                System.out.println(i.doSomething() + i.say());
            }
        }
    }
public class MyClass44 implements MyInterface45{
    public String say(){return "say()";}
    public String doSomething(){return "doSomething";}

    public static void main(String[] args) {
        MyClass44 f = new MyClass44();
            MyInterface45.MyNestedClass.goDoit(f);
    }
}
