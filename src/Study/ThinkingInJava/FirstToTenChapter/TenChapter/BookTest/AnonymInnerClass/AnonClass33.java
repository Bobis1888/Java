package Study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.AnonymInnerClass;

interface Interface12{
    void say(String s);
}
public class AnonClass33 {
    Interface12 method(){
        return new Interface12() {
            @Override
            public void say(String s) {
                System.out.println(s);
            }
        };
    }

    public static void main(String[] args) {
        AnonClass33 anonClass33 = new AnonClass33();
        anonClass33.method().say("asdadasd");
    }
}
