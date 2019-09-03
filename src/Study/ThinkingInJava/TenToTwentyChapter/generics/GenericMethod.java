package Study.ThinkingInJava.TenToTwentyChapter.generics;

public class GenericMethod {
    public static  <T,String> void f(T x,String s, Integer i){
        System.out.println(x.getClass().getName());
        System.out.println(s);
        System.out.println(i);
    }

    public static void main(String[] args) {
        f(2,"sss",78);
    }
}
