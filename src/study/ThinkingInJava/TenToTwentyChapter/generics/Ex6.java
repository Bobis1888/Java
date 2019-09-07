package study.ThinkingInJava.TenToTwentyChapter.generics;

class Dog{
    public String toString(){return "I am a dog";}
}
class Cat{
    public String toString(){return "I am a cat";}
}


public class Ex6 {
    public static void main(String[] args) {
        RandomList<Dog> randomListDog = new RandomList<>();
        RandomList<Cat> randomListCat = new RandomList<>();
        for (int i = 0; i < 20 ; i++) {
            randomListCat.add(new Cat());
            randomListDog.add(new Dog());
        }
        for (int i = 0; i < 20 ; i++) {
            System.out.println(randomListCat.select());
            System.out.println(randomListDog.select());
        }
    }
}
