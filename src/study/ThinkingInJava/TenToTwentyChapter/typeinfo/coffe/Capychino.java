package study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe;

public class Capychino extends Coffe {
    public static class Factory implements study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<Capychino>{
        public Capychino create(){return new Capychino();}
    }
}