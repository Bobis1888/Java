package Study.TenToTwentyChapter.typeinfo.pets;

public class Dog extends Pet {
    public Dog(String name){super(name);}
    public Dog(){super();}
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Dog>{
        public Dog create(){return new Dog();}
    }
}
