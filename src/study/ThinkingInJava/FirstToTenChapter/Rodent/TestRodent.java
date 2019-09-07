package study.ThinkingInJava.FirstToTenChapter.Rodent;

import java.util.*;

public class TestRodent {

    public static void main(String[] args) {
        RandomRodent generator = new RandomRodent();
        Rodent[] rodents = new Rodent[50];
        for (Rodent r:rodents) {
            r = generator.next();
        }
        ArrayList<Rodent> rodentsList = new ArrayList<Rodent>(Arrays.asList(rodents));
        Iterator<Rodent> it = rodentsList.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }
    }
}
