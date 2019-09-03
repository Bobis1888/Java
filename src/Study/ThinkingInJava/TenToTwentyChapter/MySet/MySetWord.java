package Study.ThinkingInJava.TenToTwentyChapter.MySet;

import java.util.*;
class Word{
    private static int totalCount;
    private String name;
    private int counter;
    Word(String name){
        this.name = name;
        totalCount++;
        counter = totalCount;
    }
    public void info(){
        System.out.println("name : " + name + " counter : " + counter + " totalcount : " + totalCount);
    }
}
public class MySetWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringScanner = scanner.nextLine();
        Set<String> setString = new HashSet<>(Arrays.asList(stringScanner.split(" ")));
        Set<Word> setWord = new HashSet<>();
        Iterator<String> iterator = setString.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            setWord.add(new Word(s));
        }
        System.out.println(setWord);
        for (Word w:setWord) {
            w.info();
        }
    }
}
