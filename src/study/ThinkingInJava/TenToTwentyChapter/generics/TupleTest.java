package study.ThinkingInJava.TenToTwentyChapter.generics;

import study.ThinkingInJava.FirstToTenChapter.Frog.Amphibian;
import study.ThinkingInJava.util.*;
import static study.ThinkingInJava.util.Tuple.*;

class Vehicle {
}
public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return tuple("hi",47);
    }
    static TwoTuple f2(){
        return tuple("hi",47);
    }
    static ThreeTuple<Amphibian,String,Integer> g(){
        return tuple(new Amphibian(),"hi",47);
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return tuple(new Vehicle(),new Amphibian(),"Hi",47);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return tuple(new Vehicle(),new Amphibian(),"hi",47,11.1);
    }
    static SixTuple<Vehicle,Amphibian,String,Integer,Double,Character> six(){
        return tuple(new Vehicle(),new Amphibian(),"hi",25,11.1,'C');
    }
    public static void main(String[] args) {
        SixTuple<Vehicle,Amphibian,String,Integer,Double,Character> six = six();
        System.out.println(six);
    }
}
