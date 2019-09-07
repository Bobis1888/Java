package study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class Hamster extends Rodent {
    public Hamster(String name){super(name);}
    public Hamster(){super();}
    public static class Factory implements study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Hamster>{
        public Hamster create(){return new Hamster();}
    }
}
