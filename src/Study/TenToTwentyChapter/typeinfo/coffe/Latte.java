package Study.TenToTwentyChapter.typeinfo.coffe;

public class Latte extends Coffe {
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Latte>{
        public Latte create(){return new Latte();}
    }
}
