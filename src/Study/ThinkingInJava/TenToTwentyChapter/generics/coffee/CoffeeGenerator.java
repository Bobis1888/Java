package Study.ThinkingInJava.TenToTwentyChapter.generics.coffee;

import Study.ThinkingInJava.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>{
    private Class[] types = {Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};
    private static Random random = new Random();
    public CoffeeGenerator(){}
    private int size = 0;
    public CoffeeGenerator(int size){this.size = size;}
    public Coffee next(){
        try {
            return (Coffee)
                    types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        public boolean hasNext(){return count>0;}
        public Coffee next(){
            count--;
            return CoffeeGenerator.this.next();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator(){
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5 ; i++) {
            System.out.println(gen.next());
        }
        while (gen.iterator().hasNext()){
            System.out.println(gen.next());
        }
    }
}
