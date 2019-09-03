package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe;

public class Latte extends Coffe {
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Latte>{
        public Latte create(){return new Latte();}
    }
}
