package study.ThinkingInJava.FirstToTenChapter.TenChapter.MyTest;

public class Outer {
    private String name;
    Outer(){
        name = "Outer";
    }
    class Inner{
        int i = 10;
        String s = "Inner";
        public String toString(){return name;}
    }
    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner();
        System.out.println(inner);
    }
}
