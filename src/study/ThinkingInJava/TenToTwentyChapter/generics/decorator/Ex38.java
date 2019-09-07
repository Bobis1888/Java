package study.ThinkingInJava.TenToTwentyChapter.generics.decorator;

class Coffee1{
    private static long counter = 0;
    private final long id = counter++;
    private String value;
    public void set(String value){
        this.value = value;
    }
    public String get(){
        return value;
    }
    public String toString(){
        return getClass().getSimpleName() + " " + id;
    }
}
class DecoratorCoffee extends Coffee1{
    protected Coffee1 coffee;
    DecoratorCoffee(Coffee1 coffee1){
        this.coffee = coffee1;
    }
    public void set(String value) {
        coffee.set(value);
    }
    public String get() {
        return coffee.get();
    }
}
class Cappuccino1 extends DecoratorCoffee{
    private String cappuccino = "Cappuccino";
    Cappuccino1(Coffee1 coffee1){
        super(coffee1);
    }
    public String getCappuccino(){
        return cappuccino;
    }
}
public class Ex38 {
    public static void main(String[] args) {
        Cappuccino1 cappuccino1 = new Cappuccino1(new Coffee1());
        System.out.println(cappuccino1.toString());
    }
}
