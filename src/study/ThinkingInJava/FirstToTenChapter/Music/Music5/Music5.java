package study.ThinkingInJava.FirstToTenChapter.Music.Music5;

import study.ThinkingInJava.FirstToTenChapter.Music.MyMusic.Note;

interface Playable{
    public void play(Note note);
    void adjust();
    String viewName();
}
class Instrument{
    String name;
    Instrument(String name){this.name = name;}
    Playable playable = new Playable() {
        @Override
        public void play(Note note) {
            System.out.println("Play " + name + " " + Note.MIDDLE_C);
        }

        @Override
        public void adjust() {
            System.out.println("Adjust " + name);
        }
        @Override
        public String viewName(){return name;}
    };
}
public class Music5 {
    private static void tune(Instrument instrument){
        instrument.playable.play(Note.MIDDLE_C);
    }
    private static void tuneAll(Instrument[] instruments){
        for (Instrument i: instruments) {
            tune(i);
        }
    }


    public static void main(String[] args) {
       Instrument[] orchestra = {
               new Instrument("Wind"),
               new Instrument("Woodowind"),
               new Instrument("Brass"),
               new Instrument("Balalayca")

       };

        for (Instrument i:orchestra) {
            System.out.println(i.playable.viewName());
            i.playable.adjust();
        }
        tuneAll(orchestra);
    }
}
