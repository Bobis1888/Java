package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

public class Individual {
    private String name;
    private static int counter = 0;
    private int id = counter++;
    static { counter++; }
    public int id(){ return id; }
    public String toString(){

        if (name != null){
            return name;
        }else {
            return this.getClass().getSimpleName();
        }
    }
    Individual(){}
    Individual(String name){
        this.name = name;
    }
}

