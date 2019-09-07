package study.ThinkingInJava.TenToTwentyChapter.exceptions;

class BaseballException extends RuntimeException{}
class Foul extends RuntimeException{}
class Strike extends RuntimeException{}
class UmpireException extends RuntimeException{}

abstract class Inning{
    public Inning()throws BaseballException{}
    public void event()throws BaseballException{}
    public abstract void atBat() throws Strike,Foul;
    public void walk() throws UmpireException{}
}

class StormException extends RuntimeException{}
class RainedOut extends RuntimeException{}
class PopFoul extends RuntimeException{}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    public StormyInning(){}
    public StormyInning(String s) {}
    public void rainHard(){}
    public void event(){}
    public void atBat() {}
    public void walk(){
        throw new UmpireException();
    }

    public static void main(String[] args) {

            StormyInning si = new StormyInning();
            si.atBat();

            Inning i = new StormyInning();
            i.atBat();
            i.walk();

        }
    }

