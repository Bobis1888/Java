package study.ThinkingInJava.TenToTwentyChapter.generics;

public abstract class Ex34<T extends Ex34<T>>  {
    private T t;
    abstract T set(T argument);
    T noAbstractSet(){
        System.out.println("NoAbstract");
        return set(t);
    }

    public static void main(String[] args) {
        SonA34 sonA34 = new SonA34();
        SonA34 sonA341 = new SonA34();
        sonA34.set(sonA341);
        sonA34.noAbstractSet();
    }
}
class SonA34 extends Ex34{
    Ex34 set(Ex34 argument) {
        System.out.println("SonA34.set");
        return new SonA34();
    }
}