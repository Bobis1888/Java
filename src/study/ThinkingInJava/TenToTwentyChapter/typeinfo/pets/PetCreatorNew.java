package study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets;

import study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory;

import java.util.*;

public class PetCreatorNew {
    static List<Factory<? extends Pet>> petFactories = new ArrayList<>();
    static {
        petFactories.add(new Cat.Factory());
        petFactories.add(new Cymric.Factory());
        petFactories.add(new Dog.Factory());
        petFactories.add(new EgyptMau.Factory());
        petFactories.add(new Gerbil.Factory());
        petFactories.add(new Hamster.Factory());
        petFactories.add(new Manx.Factory());
        petFactories.add(new Mutt.Factory());
        petFactories.add(new Mouse.Factory());
        petFactories.add(new Pug.Factory());
        petFactories.add(new Rat.Factory());
        petFactories.add(new Rodent.Factory());
    }
    private static Random rand = new Random();
    public static Pet reateRandomNew(){
        int n = rand.nextInt(petFactories.size());
        return petFactories.get(n).create();
    }
}
