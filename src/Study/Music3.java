package Study;

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
        for (Instrument i:instruments) {
            System.out.println(i);
        }

    }
}
class Instrument{
    void play(Note n){System.out.println("Instrument.play()" + n);}
    public String toString() { return "Instrument"; }
    void adjust(){System.out.println("Adjust Instrument");}
}
class Wind extends Instrument{
    void play(Note n){System.out.println("Wind.play()" + n);}
     public String toString() { return "Wind"; }
    void adjust(){System.out.println("Wind Adjusting");}
}
class Percussion extends Instrument{
    void play(Note n){System.out.println("Percussion.play()" + n);}
    public String toString() { return "Percussion"; }
    void adjust(){System.out.println("Wind Adjusting");}
}
class Stringed extends Instrument{
    void play(Note n){System.out.println("Stringet.play()" + n);}
    public String toString() { return "Stringed"; }
    void adjust(){System.out.println("Stringed Adjusting");}
}
class Doodo extends Instrument{
    void play(Note n){System.out.println("Doodo.play()" + n);}
    public String toString() { return "Doodo"; }
    void adjust(){System.out.println("Doodo Adjusting");}
}
class Brass extends Wind{
    void play(Note n){System.out.println("Brass.play()" + n);}
    public String toString() { return "Brass"; }
    void adjust(){System.out.println("Adjusting Brass");}
}
class Woodwind extends Wind{
    void play(Note n){System.out.println("Woodwind.play()" + n);}
    public String toString() { return "Woodwind"; }
    void adjust(){System.out.println("Adjusting Woodwind");}
}