package Study.ThinkingInJava.TenToTwentyChapter.generics;
interface TypeInterface1{
    void test();
    void test2();
}
class Type1 implements TypeInterface1{
    public void test(){
        System.out.println("Test");
    }
    public void test2(){
        System.out.println("Test2");
    }
    public void test3(){
        System.out.println("Test3");
    }
}
public class Ex20 {
    public static  <Type1 extends TypeInterface1>void testEx20(Type1 t){
        t.test();
        t.test2();
    }

    public static void main(String[] args) {
        Type1 type1 = new Type1();
        testEx20(type1);
    }
}
