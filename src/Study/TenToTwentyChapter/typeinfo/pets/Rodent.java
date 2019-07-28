package Study.TenToTwentyChapter.typeinfo.pets;

public class Rodent extends Pet {
    public Rodent(String name){super(name);}
    public Rodent(){super();}
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Rodent>{
        public Rodent create(){return new Rodent();}
    }
}
