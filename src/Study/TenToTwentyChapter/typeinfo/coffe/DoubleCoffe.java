package Study.TenToTwentyChapter.typeinfo.coffe;

public class DoubleCoffe extends Coffe {
    public static class Factory implements Study.TenToTwentyChapter.typeinfo.Factory<DoubleCoffe>{
        public DoubleCoffe create(){return new DoubleCoffe();}
    }
}
