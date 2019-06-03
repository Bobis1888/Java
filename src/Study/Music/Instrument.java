package Study.Music;

enum  Note {
    MIDDLE_C,C_SHARP,B_FLAT;
}


abstract class Instrument{
    public abstract String toString();
    void play(String name,Note note){System.out.println(name + ".play() " + note);};
    void adjust(String name){System.out.println(name + " adjusting");}
}
class InstrumentUser extends Instrument{
    private String name;
    private Note note;
    public void setNote(Note n){
        this.note = n;
    }
    InstrumentUser(String s){
        this.name = s;
    }
    void playInstrument(){
        super.play(name,note);
    }
    public String toString() {
        return name;
    }
    void adjust(){
        super.adjust(name);
    }
}
