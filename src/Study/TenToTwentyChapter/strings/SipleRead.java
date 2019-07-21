package Study.TenToTwentyChapter.strings;

import java.io.*;

public class SipleRead {
    public static BufferedReader input =
            new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));

    public static void main(String[] args) {
        try {
            System.out.println("What is your name?");
            String name = input.readLine();
            System.out.println(name);
            System.out.println("How old are you& What is your favorite double&");
            System.out.println("input:<age><double>");
            String numbers = input.readLine();
            System.out.println(numbers);
            String [] numArray = numbers.split(" ");
            int age = Integer.parseInt(numArray[0]);
            double favorite = Double.parseDouble(numArray[1]);
            System.out.println("Hi sir " + name);
            System.out.println("In 5 years you will be " + (age + 5));
            System.out.println("My favorite double is " + (favorite/2));
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
