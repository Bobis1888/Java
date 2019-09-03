package Study.ThinkingInJava.FirstToTenChapter.Adventure;

interface Fight{
    void canFight();
    void canBlock();
}
interface Eating{
    void canEat();
    void canDrink();
}
interface Tell{
    void canTell();
    void canAngryTell();
}
interface Human extends Fight,Eating,Tell{
    void canHeal();
}
abstract class MyHero{
    private String name = "Hero";
    void canTake(){
        System.out.println(name + ".canTake()");
    }
}
class Barbarian extends MyHero implements Human{
    private String name = "Conan";
    void canTake(){
        System.out.println(name + ".canTake()");
    }
    public void canFight(){
        System.out.println(name + ".canFight()");
    }
    public void canBlock(){
        System.out.println(name + ".canBlock()");
    }
    public void canEat(){
        System.out.println(name + ".canEat()");
    }
    public void canDrink(){
        System.out.println(name + ".canDrink()");
    }
    public void canTell(){
        System.out.println(name + ".canTell()");
    }
    public void canAngryTell(){
        System.out.println(name + ".canAngryTell()");
    }
    public void canHeal(){
        System.out.println(name + ".canHeal()");
    }
}
public class MyAdventure {
    private static void f(Fight a){a.canFight();}
    private static void e(Eating b){b.canEat();}
    private static void t(Tell c){c.canTell();}
    private static void h(Human d){d.canHeal();}

    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian();
        f(barbarian);
        e(barbarian);
        t(barbarian);
        h(barbarian);
    }
}
