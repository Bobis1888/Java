package Study.TenToTwentyChapter.Eleven.strings;

import java.util.*;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<>(CoffeeGenerator.getRandomCoffee(10));
        System.out.println(coffees);
    }
}
