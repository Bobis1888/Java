package Study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.AnonymInnerClass;

interface Interface22{
    void say();
}
public class AnonInnerClass {
    public Interface22 method() {
    return new Interface22() {
        @Override
        public void say() {
            System.out.println("hi");
        }
    };
    }

    public static void main(String[] args) {
        AnonInnerClass anonInnerClass = new AnonInnerClass();
        anonInnerClass.method().say();
    }
}
