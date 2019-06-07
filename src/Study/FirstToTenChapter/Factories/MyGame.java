package Study.FirstToTenChapter.Factories;

import java.util.Random;

interface MyGameInterface{
    void play();
}
interface MyGameFactory{
    MyGameInterface getMygame();
}
class Coin implements MyGameInterface{
    Coin(){
        play();
    }
    public void play(){
        Random random = new Random();
        switch (random.nextInt(2)){
            case 0:
                System.out.println("Eagle");
                break;
            case 1:
                System.out.println("Tails");
                break;
                default:
                    System.out.println("Error!");
        }
    }
}
class CoinFactory implements MyGameFactory{
    public MyGameInterface getMygame(){
        return new Coin();
    }
}
class Cube implements MyGameInterface{
    Cube(){
        play();
    }
    public void play(){
        Random random = new Random();
        switch (random.nextInt(7)){
            case 0:
                System.out.println("I");
                break;
            case 1:
                System.out.println("II");
                break;
            case 2:
                System.out.println("III");
                break;
            case 3:
                System.out.println("IV");
                break;
            case 4:
                System.out.println("V");
                break;
            case 5:
                System.out.println("VI");
                break;
            case 6:
                System.out.println("VII");
                break;
                default:
                    System.out.println("Error");
        }
    }
}
class CubeFactory implements MyGameFactory{
    public MyGameInterface getMygame(){
        return new Cube();
    }
}
public class MyGame {
    private static void playGame(MyGameFactory factory){
        MyGameInterface myGame = factory.getMygame();
    }

    public static void main(String[] args) {
        playGame(new CoinFactory());
        playGame(new CubeFactory());
    }
}
