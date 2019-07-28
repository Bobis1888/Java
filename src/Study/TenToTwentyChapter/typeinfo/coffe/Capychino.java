package Study.TenToTwentyChapter.typeinfo.coffe;

public class Capychino extends Coffe {
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<Capychino>{
        public Capychino create(){return new Capychino();}
    }
}
