package Study.TenToTwentyChapter.strings;

import java.util.*;

public class Receipt {
    private double total = 0;
    private int itemWidth = 15;
    private int qtyWidth = 15;
    private int priceWidth = 10;
    private String s1 = "%-"+ itemWidth +"s %"+ qtyWidth +"s %"+ priceWidth +"s\n";
    private String s2 = "%-"+ itemWidth +".15s %"+ qtyWidth +"d %"+ priceWidth +".2f\n";
    private String s3 = "%-" + itemWidth + "s %" + qtyWidth + "s %" + priceWidth + ".2f\n";
    private Formatter f = new Formatter(System.out);
    private void printTitle(){
        f.format(s1,"Item","Qty","Price");
        f.format(s1,"----","---","------");
    }
    private void print(String name, int qty, double price){
        f.format(s2,name,qty,price);
        total += price;
    }
    private void printTotal(){
        f.format(s3,"Tax","", total*0.06);
        f.format(s1,"","","-----");
        f.format(s3,"Total","", total*1.06);
    }
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack`s Magic Beans",4,4.25);
        receipt.print("Princess Peas",3,5.1);
        receipt.print("Three Bears Porridge",1,14.29);
        receipt.printTotal();
    }
}
