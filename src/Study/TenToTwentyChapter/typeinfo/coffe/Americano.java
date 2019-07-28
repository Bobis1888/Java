package Study.TenToTwentyChapter.typeinfo.coffe;

public class Americano extends Coffe {
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Americano>{
        public Americano create(){return new Americano();}
    }
}
