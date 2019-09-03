package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class EgyptMau extends Cat {
    public EgyptMau(String name){super(name);}
    public EgyptMau(){super();}
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<EgyptMau>{
        public EgyptMau create(){return new EgyptMau();}
    }
}
