package Study.TenToTwentyChapter.generics;

import net.mindview.util.Generator;

import java.util.Arrays;
import java.util.Random;

class StarWarsPerson{}

class GoodGuys extends StarWarsPerson{
    public String toString(){return "I am GoodGuy";}
}
class BadGuys extends StarWarsPerson{
    public String toString(){return "I am Bad AS!";}
}

class DartMoll extends BadGuys{
    public String toString(){return "I am DartMoll";}
}
class DartWeider extends BadGuys{
    public String toString(){return "I am DartWeider";}
}
class DartSirius extends BadGuys{
    public String toString(){return "I am DartSirius";}
}
class ObiVan extends GoodGuys{
    public String toString(){return "I am ObiVan";}
}
class Yoda extends GoodGuys{
    public String toString(){return "I am Yoda";}
}
class SkyWalker extends GoodGuys{
    public String toString(){return "I am SkyWalker";}
}

public class StarWars implements Generator<StarWarsPerson> {
    private Class[] person = {DartMoll.class,DartWeider.class,DartSirius.class,ObiVan.class,Yoda.class,SkyWalker.class};
    private Random random = new Random();
    public StarWarsPerson next() {
        try {
            return (StarWarsPerson) person[random.nextInt(person.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        StarWarsPerson[] people = new StarWarsPerson[10];
        StarWars starWars = new StarWars();
        for (int i = 0; i < people.length ; i++) {
            people[i] = starWars.next();
        }
        System.out.println(Arrays.toString(people));
    }
}
