package study.ThinkingInJava.TenToTwentyChapter.generics;

import study.ThinkingInJava.TenToTwentyChapter.generics.coffee.Coffee;
import study.ThinkingInJava.TenToTwentyChapter.generics.coffee.CoffeeGenerator;
import study.ThinkingInJava.util.Generator;

import java.util.*;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,int n){
        for (int i = 0; i < n ; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> List<T> fill(List<T> coll, Generator<T> gen,int n){
        for (int i = 0; i < n ; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n){
        for (int i = 0; i < n ; i++) {
            coll.add(gen.next());
        }
        return coll;
    }


    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<>(),new CoffeeGenerator(),4);
        for (Coffee c: coffees)
            System.out.println(c);
        Collection<Integer> integers = fill(new ArrayList<>(),new Fibonacci(),12);
        for (int i: integers)
            System.out.println(i);
        List<Coffee> coffees2 = fill(new ArrayList<>(),new CoffeeGenerator(),4);
        for (Coffee c: coffees2)
            System.out.println(c);
        Set<Coffee> coffees3 = fill(new HashSet<>(),new CoffeeGenerator(),4);
        for (Coffee c: coffees3)
            System.out.println(c);
    }
}
