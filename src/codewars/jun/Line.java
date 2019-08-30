package codewars.jun;

import java.util.ArrayList;

public class Line {
    public static String Tickets(int [] peopleInLine){
        final Integer price = 25;
        final Integer priceX2 = 50;
        final Integer priceX4 = 100;
        ArrayList<Integer> bank = new ArrayList<>();
        for (int banknote : peopleInLine) {
            if (banknote == price) {
                bank.add(price);
            } else if (banknote == priceX2) {
                if (bank.contains(price)) {
                    bank.remove(price);
                    bank.add(priceX2);
                } else {
                    return "NO";
                }
            } else if (banknote == priceX4){
                if (bank.contains(price)&&bank.contains(priceX2)) {
                    bank.remove(price);
                    bank.remove(priceX2);
                    bank.add(priceX4);
                } else {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(Tickets(new int[]{25,100}));
    }
}
