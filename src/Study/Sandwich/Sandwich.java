package Study.Sandwich;

class Meal{
    Meal(){
        System.out.println("Meal");
    }
}
class Bread{
    Bread(){
        System.out.println("Bred");
    }
}
class Cheese {
    Cheese() {
        System.out.println("Cheese");
    }
}
class Lattuce{
    Lattuce(){
        System.out.println("Lattuce");
    }
}
class Pickle{
    Pickle(){
        System.out.println("Pickle");
    }
}
class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("Portable Lunch");
    }
}
public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lattuce l = new Lattuce();
    private Pickle p = new Pickle();
    public void eat() {System.out.println("Eating Sandwich");}
    public void order() {System.out.println("Order Sandwich");}
    public void hotChili() {System.out.println("Add hotChili Peper");}
    public Sandwich(){
        System.out.println("Sandwich");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.eat();
        sandwich.hotChili();
        sandwich.order();
    }

}
