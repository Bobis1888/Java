package study.ThinkingInJava.FirstToTenChapter.RandomChar;

import java.nio.*;
import java.util.*;

class RandomChar {
    char next(){
        Random random = new Random();
        return (char) random.nextInt(128);
    }
}

public class AdapterRandomChar extends RandomChar implements Readable{
    private int count;
    public AdapterRandomChar(int count){this.count = count;}
    public int read(CharBuffer cb){
        if (count-- == 0)
            return -1;
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdapterRandomChar(16));
        while (scanner.hasNext())
            System.out.print(scanner.next() + " ");
    }
}
