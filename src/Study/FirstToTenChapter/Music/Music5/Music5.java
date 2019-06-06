package Study.FirstToTenChapter.Music.Music5;

import Study.FirstToTenChapter.Music.MyMusic.Note;

interface Playable{
    public void play(Note note);
}
abstract class Instrument{
    public String toString(){return "Instrument";}
    abstract void adjust();
}
class Wind extends Instrument implements Playable{
    private String name = "Wind";
    public void play(Note note){
        System.out.println(name + ".play()" + note);
    }
    public String toString(){
        return name;
    }

    public void adjust() {
        System.out.println(name + ".adjust()");
    }
}
class Percussion extends Instrument implements Playable{
    private String name = "Percussion";
    public void play(Note note){
        System.out.println(name + ".play()" + note);
    }
    public String toString(){
        return name;
    }
    public void adjust(){
        System.out.println(name + ".adjust()");
    }
}
class Stringed extends Instrument implements Playable{
    private String name = "Stringed";
    public void play(Note note){
        System.out.println(name + ".play()" + note);
    }
    public String toString(){
        return name;
    }
    public void adjust(){
        System.out.println(name + ".adjust()");
    }
}
class Brass extends Wind{
    private String name = "Brass";
    public String toString(){
        return name;
    }
    public void play(Note note){
        System.out.println(name + ".play()");
    }
}
class Woodwind extends Wind{
    private String name = "Woodwind";
    public String toString(){
        return name;
    }
    public void play(Note note){
        System.out.println(name + ".play()");
    }
}
public class Music5 {
    private static void tune(Playable playable){
        playable.play(Note.MIDDLE_C);
    }
    private static void tuneAll(Playable[] playable){
        for (Playable p:playable) {
            tune(p);
        }
    }

    public static void main(String[] args) {
       Playable[] orchestra = {
               new Wind(),
               new Woodwind(),
               new Brass(),
               new Percussion(),
               new Stringed()
       };
       tuneAll(orchestra);
    }
}
