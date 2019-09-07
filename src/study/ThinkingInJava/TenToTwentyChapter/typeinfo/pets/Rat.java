package study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class Rat extends Rodent {
    public Rat(String name){super(name);}
    public Rat(){super();}
    public static class Factory implements study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Rat>{
        public Rat create(){return new Rat();}
    }
}
