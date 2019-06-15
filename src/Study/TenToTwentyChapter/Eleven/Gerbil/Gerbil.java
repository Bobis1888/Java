package Study.TenToTwentyChapter.Eleven.Gerbil;

import java.util.ArrayList;

public class Gerbil {
    private int gerbilNumber;
    Gerbil(int i){
        gerbilNumber=i;
    }
    public void hop(){
        System.out.println("This Gebril № " + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<>();
        for (int i = 0; i < 8 ; i++) {
            gerbilArrayList.add(i, new Gerbil(i));
        }
        for (int i = 0; i <gerbilArrayList.size() ; i++) {
            gerbilArrayList.get(i).hop();
        }
    }
}
