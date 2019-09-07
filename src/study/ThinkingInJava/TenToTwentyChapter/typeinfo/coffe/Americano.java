package study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe;

public class Americano extends Coffe {
    public static class Factory implements study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Americano>{
        public Americano create(){return new Americano();}
    }
}
