package Study.FirstToTenChapter.Processor;

import java.util.Scanner;

class MyProcessor {
    public String process(String s){
    char[] arrayChars = s.toCharArray();
        for (int i = 1; i <arrayChars.length ; i+=2) {
            char buf = arrayChars[i];
            arrayChars[i] = arrayChars[i-1];
            arrayChars[i-1] = buf;
        }
        return new String(arrayChars);
    }
}
class AdapterMyProcessor implements Processor{
    public String name(){
        return "AdapterMyProcess";
    }
    MyProcessor myProcessor;
    AdapterMyProcessor(MyProcessor myProcessor){
        this.myProcessor = myProcessor;
    }
    public String process(Object input){
        return myProcessor.process((String)input);
    }
}
public class MyProcessorTest{
    public static void main(String[] args) {
        String s = "asadadads";
        Apply.process(new AdapterMyProcessor(new MyProcessor()),s);
    }
}
