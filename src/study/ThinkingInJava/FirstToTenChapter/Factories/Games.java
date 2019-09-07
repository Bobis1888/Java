package study.ThinkingInJava.FirstToTenChapter.Factories;

interface Game {boolean move();}
interface GameFactory{Game getGame();}

class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 9;
    public boolean move(){
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}
class CheckersFactory implements GameFactory{
    public Game getGame(){return new Checkers();}
}
class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 10;
    public boolean move(){
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}
class ChessFactory implements GameFactory{
    public Game getGame(){return new Chess();}
}
public class Games{
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}