package study.ThinkingInJava.FirstToTenChapter.TenChapter.MyTest;

class Outer2{
        class Inner{
            public String toString(){
                return "SSSSSSSSSSS";
            }
            Inner(){
                System.out.println("Iner();");
            }
        }
}
public class OtherOuter{
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();
        System.out.println(oi.toString());
    }
}