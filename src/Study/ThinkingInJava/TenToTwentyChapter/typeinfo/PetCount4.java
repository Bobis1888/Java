package Study.ThinkingInJava.TenToTwentyChapter.typeinfo;

import Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Pet;
import Study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Pets;
import Study.ThinkingInJava.util.TypeCounter;

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
