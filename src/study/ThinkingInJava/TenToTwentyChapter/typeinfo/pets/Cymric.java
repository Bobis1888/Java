package study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class Cymric extends Manx {
    public Cymric(String name){super(name);}
    public Cymric(){super();}
    public static class Factory implements study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Cymric>{
        public Cymric create(){return new Cymric();}
    }
}