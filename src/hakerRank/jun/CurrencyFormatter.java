package hakerRank.jun;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String[] args) {
       String s = NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(250.250).substring(1);
       String s1 = "Rs." + s;
        System.out.println(s1);

    }
}
