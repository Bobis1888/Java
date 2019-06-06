package Study.FirstToTenChapter.Music.MyMusic;

interface Playble{
    void play();
}
abstract class Instrument implements Playble{
    void play(String name,Note note){System.out.println(name + ".play() " + note);};
    void adjust(String name){System.out.println(name + " adjusting");}
}
class InstrumentUser extends Instrument implements Playble{
    private String name;
    private Note note;
    void setNote(Note n){
        this.note = n;
    }
    InstrumentUser(String s){
        this.name = s;
    }
    public void play(){
        super.play(name,note);
    }
    public String toString() {
        return name;
    }
    void adjust(){
        super.adjust(name);
    }
}
