package Rodent;

import java.util.Random;

class Shared{
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        System.out.println("Create " + this);
    }
    public void addRef(){
        refcount++;
    }
    protected void dispose(){
        if (--refcount == 0){
            System.out.println("Disposing " + this);
        }
    }
    public String toString(){
        return "Shared " + id;
    }
    public void showRefcount() {
        System.out.println("refcount = " + refcount); }
}


class RandomRodentGenerator {
    private Random random = new Random();
    protected Shared shared = new Shared();
    public Rodent next(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Mouse(shared);
            case 1: return new Hamster(shared);
            case 2: return new Squirrel(shared);
        }
    }
}


class Rodent {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Rodent(Shared shared){
        System.out.println("Create Rodent " + id);
        this.shared = shared;
        this.shared.addRef();
    }
    void eating(){
        System.out.println("Rodent eating");
    }
    void fear(){
        System.out.println("Rodent fear");
    }
}
class Mouse extends Rodent{
    Mouse(Shared shared){
        super(shared);
        System.out.println("Create Mouse");
    }
    void eating(){
        System.out.println("Mouse eating cheese");
    }
    void fear(){
        System.out.println("Mouse fear a cat");
    }
    public String toString(){
        return "Mouse";
    }
}
class Hamster extends Rodent{
    Hamster(Shared shared){
        super(shared);
        System.out.println("Create Hamster");
    }
    void eating(){
        System.out.println("Hamster eating nuts");
    }
    void fear(){
        System.out.println("The hamster is afraid of the eagle");
    }
    public String toString(){
        return "Hamster";
    }
}
class Squirrel extends Rodent{
    Squirrel(Shared shared){
        super(shared);
        System.out.println("Create Squirrel");
    }
    void eating(){
        System.out.println("Squirrel eating nuts");
    }
    void fear(){
        System.out.println("Squirrel is afraid of people");
    }
    public String toString(){
        return "Squirrel";
    }
}
