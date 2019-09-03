package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe;

public class BlackCoffe extends Coffe {
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<BlackCoffe>{
        public BlackCoffe create(){return new BlackCoffe();}
    }
}
