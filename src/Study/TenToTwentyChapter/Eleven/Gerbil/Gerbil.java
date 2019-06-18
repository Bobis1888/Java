package Study.TenToTwentyChapter.Eleven.Gerbil;

import java.util.*;

public class Gerbil {
    private static int x = 0;
    private int gerbilNumber;
    Gerbil(){
        x++;
        gerbilNumber=x;
    }
    public void hop(){
        System.out.println("This Gerbil № " + gerbilNumber);
    }
    public static List<Gerbil> getArray(int size){
        List<Gerbil> list = new ArrayList<Gerbil>();
        for (int i = 0; i <  size; i++) {
            list.add(i,new Gerbil());
        }
    return list;
    }

    public static void main(String[] args) {
        List<Gerbil> list = Gerbil.getArray(12);
        Iterator<Gerbil> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().hop();
        }
    }
}
