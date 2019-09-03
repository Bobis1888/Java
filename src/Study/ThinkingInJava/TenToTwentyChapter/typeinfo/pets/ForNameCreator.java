package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] typeName = {
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Mutt",
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Pug",
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.EgyptMau",
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Manx",
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Cymric",
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Rat",
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Mouse",
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Hamster",
            "Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Gerbil"
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        try {
            for (String name : typeName ){
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    static {loader();}
    public List<Class<? extends Pet>> types() {return types;}
}
