package Study.TenToTwentyChapter.generics;

import Study.net.mindview.util.Generator;

import java.util.*;

class BigFish{
    private static long counter = 1;
    private final long id = counter++;
    private BigFish(){}
    public String toString(){return "Big Fish " + id;}
    public static Generator<BigFish> generator(){
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}
class LittleFish{
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish(){}
    public String toString(){return "Big Fish " + id;}
    public static Generator<LittleFish> generator(){
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}
public class Ex18 {
    public static void eating(BigFish b,LittleFish l){
        System.out.println(b + " eating " + l);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Queue<LittleFish> ocean = new LinkedList<>();
        Generators.fill(ocean,LittleFish.generator(),25);
        List<BigFish> bigFish = new ArrayList<>();
        Generators.fill(bigFish,BigFish.generator(),5);
        for (LittleFish l: ocean)
            eating(bigFish.get(random.nextInt(bigFish.size())),l);
    }
}
