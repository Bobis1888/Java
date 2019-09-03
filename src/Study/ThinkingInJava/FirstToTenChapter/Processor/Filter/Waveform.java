package Study.ThinkingInJava.FirstToTenChapter.Processor.Filter;

public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){return "Waveform " + id;}
}
class Filter{
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){return input;}
}
class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
class HightPass extends Filter{
    double cutoff;
    public HightPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
class BandPass extends Filter{
    double lowCutoff,hightCutoff;
    public BandPass(double lowCut, double hightCut){
        lowCutoff = lowCut;
        hightCutoff = hightCut;
    }
    public Waveform process(Waveform input){return input;}
}
