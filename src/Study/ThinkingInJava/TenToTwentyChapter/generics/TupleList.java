package Study.ThinkingInJava.TenToTwentyChapter.generics;

import Study.ThinkingInJava.FirstToTenChapter.Frog.Amphibian;
import Study.ThinkingInJava.util.FourTuple;

import java.util.*;

public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian,String,Integer> tl = new TupleList<>();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());
        for (FourTuple<Vehicle, Amphibian,String,Integer> i: tl)
            System.out.println(i);
    }
}
