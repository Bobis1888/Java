package codewars.jun;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FruitGuy {
    public static String [] removeRotten(String[] fruitBasket){
        if (fruitBasket==null)
            return new String[0];
        for (int i = 0; i < fruitBasket.length ; i++) {
            Matcher matcher = Pattern.compile("rotten").matcher(fruitBasket[i]);
            if (matcher.find())
                fruitBasket[i] = matcher.replaceAll("").toLowerCase();
        }
        return fruitBasket;
    }

    public static void main(String[] args) {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        System.out.println(Arrays.toString(removeRotten(rotten)));
    }
}
