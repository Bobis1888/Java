package Study.TenToTwentyChapter.strings;

import java.util.*;

class Coffee{
    static int counter = 0;
    Coffee(){counter++;}
}
class Americano extends Coffee{
    private int current;
    Americano(){current = counter;}
    public String toString(){return "Americano " + current;}
}

class Latte extends Coffee{
    private int current;
    Latte(){current = counter;}
    public String toString(){return "Latte " + current;}
}

class Cappuccino extends Coffee{
    private int current;
    Cappuccino(){current = counter;}
    public String toString(){return "Cappuccino " + current;}
}

class Breve extends Coffee{
    private int current;
    Breve(){current = counter;}
    public String toString(){return "Breve " + current;}
}

class Mocha extends Coffee{
    private int current;
    Mocha(){current = counter;}
    public String toString(){return "Mocha " + current;}
}

public class CoffeeGenerator {
    static List<Coffee> getRandomCoffee(int value){
        Random rand = new Random();
        List<Coffee>list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            switch (rand.nextInt(5)){
                case 0: list.add(new Americano());
                break;
                case 1: list.add(new Latte());
                break;
                case 2: list.add(new Cappuccino());
                break;
                case 3: list.add(new Breve());
                break;
                case 4: list.add(new Mocha());

            }
        }
        return list;
    }
}