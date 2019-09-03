package Study.ThinkingInJava.TenToTwentyChapter.typeinfo;

import Study.ThinkingInJava.TenToTwentyChapter.typeinfo.coffe.*;
import Study.ThinkingInJava.util.TypeCounter;

import java.util.*;

class CoffeGenerator{
    private static List<Factory<? extends Coffe>> coffeList = new ArrayList<>();
    static {
        coffeList.add(new Americano.Factory());
        coffeList.add(new BlackCoffe.Factory());
        coffeList.add(new Capychino.Factory());
        coffeList.add(new DoubleCoffe.Factory());
        coffeList.add(new Latte.Factory());
    }
    private static Random random = new Random();
    static Coffe coffeGenerator(){
        int n = random.nextInt(coffeList.size());
        return coffeList.get(n).create();
    }
}
public class Ex12 {
    public static void main(String[] args) {
        TypeCounter typeCounter = new TypeCounter(Coffe.class);
        ArrayList<Coffe> coffeArrayList = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            coffeArrayList.add(CoffeGenerator.coffeGenerator());
        }
        for (Coffe c:coffeArrayList) {
            System.out.println(c.getClass().getSimpleName() + " ");
            typeCounter.count(c);
        }
        System.out.println(typeCounter);
        }
    }

