package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class Pug extends Dog {
    public Pug(String name){super(name);}
    public Pug(){super();}
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Pug>{
        public Pug create(){return new Pug();}
    }
}

