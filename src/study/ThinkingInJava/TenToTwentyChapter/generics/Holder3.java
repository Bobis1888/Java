package study.ThinkingInJava.TenToTwentyChapter.generics;

import study.ThinkingInJava.TenToTwentyChapter.typeinfo.pets.Pet;

public class Holder3<T> {
    private T a;
    public Holder3(T a){this.a = a;}
    public void set(T a){this.a = a;}
    public T get(){return a;}

    public static void main(String[] args) {
        Holder3<Pet> h3 = new Holder3<>(new Pet("as"));
        h3.get();
    }
}
