package Study.ThinkingInJava.FirstToTenChapter.Music.MyMusic;


import java.util.Random;
import java.util.Scanner;

class RandomRand {
    private Random randoms = new Random();
    private InstrumentUser nexts(){
        switch (randoms.nextInt(5)){
            default:
            case 0: return new InstrumentUser("Wind");
            case 1: return new InstrumentUser("Woodwind");
            case 2: return new InstrumentUser("Doodo");
            case 3: return new InstrumentUser("Percussion");
            case 4: return new InstrumentUser("Stringed");
        }
    }
    private Note nextNotes(){
        switch (randoms.nextInt(3)){
            default:
            case 0: return Note.B_FLAT;
            case 1: return Note.C_SHARP;
            case 2: return Note.MIDDLE_C;
        }
    }

    InstrumentUser[] arrayGet(int arrayLenght){
        InstrumentUser[] array = new InstrumentUser[arrayLenght];
        for (int i = 0; i <array.length ; i++) {
            array[i] = nexts();
            array[i].setNote(nextNotes());
        }
        return array;
    }
}
public class TestMusic{
    private static void tuneAll(InstrumentUser[] e){
        for (int i = 0; i <e.length; i++) {
            e[i].play();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Conductor. What size orchestra do you want >>>");
        int scanInt = scanner.nextInt();
        RandomRand randomRand = new RandomRand();
        InstrumentUser[] orchestra = randomRand.arrayGet(scanInt);
        for (int i = 0; i <orchestra.length ; i++) {
            System.out.println(orchestra[i].toString());
            orchestra[i].adjust();
        }
        System.out.println("Orchestra size = " + scanInt);
        tuneAll(orchestra);
    }
}
