package Study.FirstToTenChapter.Frog;

class Characcteristic{
    private String s;
    Characcteristic(String s){
        this.s = s;
        System.out.println("Create Characteristic " + s);
    }
    protected void dispose(){
        System.out.println("Finish Characteristic " + s);
    }
}
class Description{
    private String s;
    Description(String s){
        this.s = s;
        System.out.println("Create Description " + s);
    }
    protected void dispose(){
        System.out.println("Finish Description " + s);
    }
}
class LivingCreature{
    private Characcteristic p = new Characcteristic("Live Creature");
    private Description t = new Description("Just Live Creature");
    LivingCreature(){
        System.out.println("Create Living Creature");
    }
    protected void dispose(){
        System.out.println("Finish Living Creature ");
        t.dispose();
        p.dispose();
    }
}
class Animal extends LivingCreature{
    private Characcteristic p = new Characcteristic("Have a heart");
    private Description t = new Description("Animal, not plant");
    Animal(){
        System.out.println("Create Animal");
    }
    protected void dispose(){
        System.out.println("Finish animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characcteristic p = new Characcteristic("Can live in water");
    private Description t = new Description("And in the water, and on the ground");
    Amphibian(){
        System.out.println("Create Amphibian");
    }
    protected void dispose(){
        System.out.println("Finish Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian {
    private Characcteristic p = new Characcteristic("croaks");
    private Description t = new Description("Eating beetle");
    public Frog(){
        System.out.println("Create Study.FirstToTenChapter.Frog");
    }
    protected void dispose(){
        System.out.println("Finish Study.FirstToTenChapter.Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        try {
            System.out.println("Good By");
            return;
        }finally {
            frog.dispose();
        }
    }
}
