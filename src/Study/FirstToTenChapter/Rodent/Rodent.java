package Study.FirstToTenChapter.Rodent;

import java.util.Random;

interface Rodent {
    void eating();
    void fear();
}
class Mouse implements Rodent{
    Mouse(){
        System.out.println("Create Mouse");
    }
    public void eating(){
        System.out.println("Mouse eating cheese");
    }
    public void fear(){
        System.out.println("Mouse fear a cat");
    }
    public String toString(){
        return "Mouse";
    }
}
class Hamster implements Rodent{
    Hamster(){
        System.out.println("Create Hamster");
    }
    public void eating(){
        System.out.println("Hamster eating nuts");
    }
    public void fear(){
        System.out.println("The hamster is afraid of the eagle");
    }
    public String toString(){
        return "Hamster";
    }
}
class Squirrel implements Rodent{
    Squirrel(){
        System.out.println("Create Squirrel");
    }
    public void eating(){
        System.out.println("Squirrel eating nuts");
    }
    public void fear(){
        System.out.println("Squirrel is afraid of people");
    }
    public String toString(){
        return "Squirrel";
    }
}
class RandomRodent{
    public Random random = new Random();
    public Rodent next(){
        switch (random.nextInt(3)) {
            default:
            case 0:return
                new Mouse();
            case 1:return
                new Hamster();
            case 2:return
                new Squirrel();
        }
    }
}


