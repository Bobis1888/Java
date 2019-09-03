package Study.ThinkingInJava.FirstToTenChapter.Processor.Filter;

import Study.ThinkingInJava.FirstToTenChapter.Processor.Apply;
import Study.ThinkingInJava.FirstToTenChapter.Processor.Processor;

class FilterAdapter implements Processor{
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }
    public String name(){
        return filter.name();
    }
    public String process(Object input){
        return String.valueOf(filter.process((Waveform)input));
    }
}
public class FilterProcessor{
    public static void main(String[] args) {
    Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HightPass(2.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),w);
    }
}
