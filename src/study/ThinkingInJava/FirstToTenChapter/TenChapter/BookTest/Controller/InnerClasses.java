package study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.Controller;

class WithInner{
    class Inner{
        Inner(int i){}
    }
}
public class InnerClasses {
    private int i;
    class InnerClasses2 extends WithInner.Inner{
        InnerClasses2(WithInner wi){
            wi.super(i);
        }
    }
}
