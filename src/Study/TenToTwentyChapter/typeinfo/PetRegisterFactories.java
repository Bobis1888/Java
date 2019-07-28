package Study.TenToTwentyChapter.typeinfo;

import Study.TenToTwentyChapter.typeinfo.pets.Pet;
import Study.TenToTwentyChapter.typeinfo.pets.PetCreatorNew;
import net.mindview.util.TypeCounter;

import java.util.ArrayList;

public class PetRegisterFactories {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        ArrayList<Pet> petArrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            petArrayList.add(PetCreatorNew.reateRandomNew());
        }
        for (Pet pet : petArrayList){
            System.out.println(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println(counter);
    }
}
