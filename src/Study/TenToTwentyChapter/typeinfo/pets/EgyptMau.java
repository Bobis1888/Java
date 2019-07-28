package Study.TenToTwentyChapter.typeinfo.pets;

public class EgyptMau extends Cat {
    public EgyptMau(String name){super(name);}
    public EgyptMau(){super();}
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<EgyptMau>{
        public EgyptMau create(){return new EgyptMau();}
    }
}
