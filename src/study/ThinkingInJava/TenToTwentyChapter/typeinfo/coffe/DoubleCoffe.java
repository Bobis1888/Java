package study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe;

public class DoubleCoffe extends Coffe {
    public static class Factory implements study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<DoubleCoffe>{
        public DoubleCoffe create(){return new DoubleCoffe();}
    }
}
