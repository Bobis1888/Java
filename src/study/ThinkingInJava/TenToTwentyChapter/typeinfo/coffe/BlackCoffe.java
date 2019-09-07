package study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe;

public class BlackCoffe extends Coffe {
    public static class Factory implements study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<BlackCoffe>{
        public BlackCoffe create(){return new BlackCoffe();}
    }
}
