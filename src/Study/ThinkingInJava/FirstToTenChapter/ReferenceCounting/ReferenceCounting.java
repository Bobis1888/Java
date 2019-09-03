package Study.ThinkingInJava.FirstToTenChapter.ReferenceCounting;

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
   /* protected void finalize(){
        if (refcount>0){
            System.out.println("Error: " + refcount + " Shared " + id + "  object in use");
        }
    }*/
    protected void dispose(){
        if (--refcount == 0){
            System.out.println("Disposing " + this);
        }
    }
    public String toString(){
        return  "Shared " + id;
    }
}
class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Create " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for (Composing c:composing) {
            c.dispose();
        }
       /* Composing compTest1 = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        sharedTest.finalize();*/
    }
}
