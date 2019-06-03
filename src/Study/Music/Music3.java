package Study.Music;

public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Randoms randoms = new Randoms();
        Instrument[] instruments = new Instrument[10];
        for (int i = 0; i <instruments.length ; i++) {
            instruments[i] = randoms.next();
        }
        tuneAll(instruments);

    }
}
abstract class Instrument{
    private int i;
    public abstract void play(Note n);
    public String toString() { return "Instrument"; }
    public abstract void adjust();
}
class Wind extends Instrument{
    public void play(Note n){System.out.println("Wind.play()" + n);}
    public String toString() { return "Wind"; }
    public void adjust(){System.out.println("Wind Adjusting");}
}
class Percussion extends Instrument{
    public void play(Note n){System.out.println("Percussion.play()" + n);}
    public String toString() { return "Percussion"; }
    public void adjust(){System.out.println("Wind Adjusting");}
}
class Stringed extends Instrument{
    public void play(Note n){System.out.println("Stringet.play()" + n);}
    public String toString() { return "Stringed"; }
    public void adjust(){System.out.println("Stringed Adjusting");}
}
class Doodo extends Instrument{
    public void play(Note n){System.out.println("Doodo.play()" + n);}
    public String toString() { return "Doodo"; }
    public void adjust(){System.out.println("Doodo Adjusting");}
}
class Brass extends Wind{
    public void play(Note n){System.out.println("Brass.play()" + n);}
    public String toString() { return "Brass"; }
    public void adjust(){System.out.println("Adjusting Brass");}
}
class Woodwind extends Wind{
    public void play(Note n){System.out.println("Woodwind.play()" + n);}
    public String toString() { return "Woodwind"; }
    public void adjust(){System.out.println("Adjusting Woodwind");}
}