package Study.TenToTwentyChapter.generics;

import Study.TenToTwentyChapter.typeinfo.pets.*;
import java.util.*;

public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs){
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<>();
        oldStyleMethod(dogs1);
        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(),Dog.class);
        try {
            oldStyleMethod(dogs2);
        }catch (Exception e){
            System.out.println(e);
        }
        List<Pet> pets = Collections.checkedList(new ArrayList<>(),Pet.class);
        pets.add(new Study.TenToTwentyChapter.typeinfo.pets.Dog());
        pets.add(new Study.TenToTwentyChapter.typeinfo.pets.Cat());
    }
}
