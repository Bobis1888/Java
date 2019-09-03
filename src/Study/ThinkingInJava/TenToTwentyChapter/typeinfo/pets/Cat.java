package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class Cat extends Pet{
    public Cat(String name){super(name);}
    public Cat(){super();}
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Cat>{
        public Cat create(){return new Cat();}
    }
}
