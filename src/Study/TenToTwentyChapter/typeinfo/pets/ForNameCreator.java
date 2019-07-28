package Study.TenToTwentyChapter.typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] typeName = {
            "Study.TenToTwentyChapter.typeinfo.pets.Mutt",
            "Study.TenToTwentyChapter.typeinfo.pets.Pug",
            "Study.TenToTwentyChapter.typeinfo.pets.EgyptMau",
            "Study.TenToTwentyChapter.typeinfo.pets.Manx",
            "Study.TenToTwentyChapter.typeinfo.pets.Cymric",
            "Study.TenToTwentyChapter.typeinfo.pets.Rat",
            "Study.TenToTwentyChapter.typeinfo.pets.Mouse",
            "Study.TenToTwentyChapter.typeinfo.pets.Hamster",
            "Study.TenToTwentyChapter.typeinfo.pets.Gerbil"
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
