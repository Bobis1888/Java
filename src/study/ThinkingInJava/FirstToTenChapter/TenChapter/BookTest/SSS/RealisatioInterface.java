package study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.SSS;

interface Interface43{
    void sayHi();
}

public class RealisatioInterface {
    public Interface43 getInterface(boolean b){
        if (b){
        class InnerRelClassBasic implements Interface43{
            public void sayHi() {
                System.out.println("Hi");
            }
        }
        return new InnerRelClassBasic();
    }
        return null;
    }

    public static void main(String[] args) {
        RealisatioInterface realisatioInterface = new RealisatioInterface();
        realisatioInterface.getInterface(true).sayHi();
    }
}
