package Study.TenToTwentyChapter.typeinfo.pets;

public class Mutt extends Dog {
    public Mutt(String name){super(name);}
    public Mutt(){super();}
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Mutt>{
        public Mutt create(){return new Mutt();}
    }
}
