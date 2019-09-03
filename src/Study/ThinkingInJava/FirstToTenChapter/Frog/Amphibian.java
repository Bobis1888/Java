package Study.ThinkingInJava.FirstToTenChapter.Frog;

public class Amphibian extends Animal{
    private Characcteristic p = new Characcteristic("Can live in water");
    private Description t = new Description("And in the water, and on the ground");
    public Amphibian(){
        System.out.println("Create Amphibian");
    }
    protected void dispose(){
        System.out.println("Finish Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
