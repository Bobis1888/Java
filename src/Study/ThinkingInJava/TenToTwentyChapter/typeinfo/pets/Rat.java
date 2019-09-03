package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class Rat extends Rodent {
    public Rat(String name){super(name);}
    public Rat(){super();}
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Rat>{
        public Rat create(){return new Rat();}
    }
}
