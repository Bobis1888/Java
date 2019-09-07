package study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class Rodent extends Pet {
    public Rodent(String name){super(name);}
    public Rodent(){super();}
    public static class Factory implements study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Rodent>{
        public Rodent create(){return new Rodent();}
    }
}
