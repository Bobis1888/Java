package Study.TenToTwentyChapter.typeinfo.pets;

import Study.TenToTwentyChapter.typeinfo.Factory;

public class Cat extends Pet{
    public Cat(String name){super(name);}
    public Cat(){super();}
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Cat>{
        public Cat create(){return new Cat();}
    }
}
