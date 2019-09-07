package study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.SSS;

public class Class37 {
    protected int i = 1;
    protected void getInt(){
        System.out.println(i);
    }
    protected class InnerClass37{
        protected void setInt(int x){
            i = x;
            getInt();
        }
    }
    public void getInerClass37(int z){
        InnerClass37 innerClass37 = new InnerClass37();
        innerClass37.setInt(z);
    }

    public static void main(String[] args) {
        Class37 class37 = new Class37();
        class37.getInt();
        class37.getInerClass37(25);
        class37.getInt();
    }
}
