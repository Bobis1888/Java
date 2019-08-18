package Study.TenToTwentyChapter.typeinfo.pets;

public class Mouse extends Rodent {
    public Mouse(String name){super(name);}
    public Mouse(){super();}
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Mouse>{
        public Mouse create(){return new Mouse();}
    }
}