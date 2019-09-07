package study.ThinkingInJava.TenToTwentyChapter.generics;

interface GenericGetter<T extends GenericGetter<T>>{
    T get();
}
interface Getter extends GenericGetter<Getter>{}

class A3 implements Getter{
    public A3 get(){
        return new A3();
    }
}
class B3 implements GenericGetter<B3>{
    public B3 get(){
        return new B3();
    }
}

public class GenericsAndReturnTypes {
    static void test(Getter g){
        Getter result = g.get();
        GenericGetter gg = g.get();
    }

    public static void main(String[] args) {
     test(new A3());
    }
}
