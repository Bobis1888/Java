package Study.TenToTwentyChapter.typeinfo.coffe;

public class BlackCoffe extends Coffe {
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<BlackCoffe>{
        public BlackCoffe create(){return new BlackCoffe();}
    }
}
