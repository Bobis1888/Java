package Study.TenToTwentyChapter.typeinfo.pets;

public class Manx extends Cat {
    public Manx(String name){super(name);}
    public Manx(){super();}
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Manx>{
        public Manx create(){return new Manx();}
    }
}
