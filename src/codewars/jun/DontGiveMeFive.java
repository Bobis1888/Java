package codewars.jun;

import java.util.regex.*;

public class DontGiveMeFive {
    private static int dontGiveMeFive(int start, int end){
        System.out.print(start + "," + end + " -> ");
        int result = 0;



        for (int i = start; i <= end ; i++) {
          Matcher pattern = Pattern.compile("5+").matcher(Integer.toString(i));
           if (pattern.find()){
               continue;
           }else{
               System.out.print(i + ",");
               result++;
           }
        }
        System.out.println("-> Result " + result);
        return result;
    }

    public static void main(String[] args) {
        DontGiveMeFive.dontGiveMeFive(4,17);
    }
}
/*
Don't give me five!
In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it. The start and the end number are both inclusive!

Examples:

1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12
The result may contain fives. ;-)
The start number will always be smaller than the end number. Both numbers can be also negative!

I'm very curious for your solutions and the way you solve it. Maybe someone of you will find an easy pure mathematics solution.

Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!
*/