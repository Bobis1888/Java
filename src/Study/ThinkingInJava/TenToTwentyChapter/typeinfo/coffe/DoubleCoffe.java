package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe;

public class DoubleCoffe extends Coffe {
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<DoubleCoffe>{
        public DoubleCoffe create(){return new DoubleCoffe();}
    }
}
