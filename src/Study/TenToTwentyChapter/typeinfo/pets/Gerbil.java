package Study.TenToTwentyChapter.typeinfo.pets;

public class Gerbil extends Pet {
    public Gerbil(String name){super(name);}
    public Gerbil(){super();}
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Gerbil>{
        public Gerbil create(){return new Gerbil();}
    }
}
