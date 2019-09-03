package Study.ThinkingInJava.TenToTwentyChapter.generics;

class House22{
    private String name;
    private int floors;
    House22(String name, int floors){
        this.floors = floors;
        this.name = name;
    }
}
public class Ex22 {
    public static Object create22(String name) throws Exception{
        return Class.forName(name).newInstance();
    }

    public static void main(String[] args) throws Exception {
        create22("House22");
    }
}
