package Study.Music;

import java.util.Random;

public class Randoms {
    private Random random = new Random();
    public Instrument next(){
        switch (random.nextInt(7)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Doodo();
            case 4: return new Brass();
            case 5: return new Woodwind();
        }
    }
}
