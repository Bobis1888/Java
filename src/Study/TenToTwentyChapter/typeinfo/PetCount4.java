package Study.TenToTwentyChapter.typeinfo;

import Study.TenToTwentyChapter.typeinfo.pets.Pet;
import Study.TenToTwentyChapter.typeinfo.pets.Pets;
import net.mindview.util.TypeCounter;

import java.lang.reflect.Type;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet: Pets.createArray(20)){
            System.out.println(pet.getClass().getSimpleName());
            counter.count(pet);
        }
        System.out.println(counter);
    }
}
