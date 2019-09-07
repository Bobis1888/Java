package study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe;

public class Coffe {
    private static int counter = 0;
    private int id = counter++;
    static {
        counter++;
    }
    public int id(){return id;}
}
