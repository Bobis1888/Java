package Study.FirstToTenChapter.Cycle;

interface Cycle { void wheel(); void balance(); }
interface CycleFactory{ Cycle getCycle();}

class Unicycle implements Cycle {
    public void wheel(){
        System.out.println("One wheel");
    }
    public void balance(){
        System.out.println("Balance unicycle");
    }
    Unicycle(){
        wheel();
        balance();
    }
}
class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){return new Unicycle();}
}

class Bicycle implements Cycle {
    public void wheel(){
        System.out.println("Two wheels");
    }
    public void balance(){
        System.out.println("Balance bicycle");
    }
    Bicycle(){
        wheel();
        balance();
    }
}
class BicyckeFactory implements CycleFactory{
    public Cycle getCycle(){return new Bicycle();}
}

class Tricycle implements Cycle{
    public void wheel(){
        System.out.println("Three wheels");
    }
    public void balance(){ System.out.println("Tricycle balance"); }
    Tricycle(){
        wheel();
        balance();
    }
}
class TricycleFactory implements CycleFactory{
    public Cycle getCycle(){return new Tricycle();}
}
public class CycleMain{
    public static void asd(CycleFactory factory){
        Cycle cycle = factory.getCycle();
    }
    public static void main(String[] args) {
        asd(new UnicycleFactory());
        asd(new BicyckeFactory());
        asd(new TricycleFactory());

    }
}
