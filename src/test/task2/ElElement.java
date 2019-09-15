package test.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElElement implements IElement {
    private static long counter = 0;
    private int number = 0;
    private long id = 0;
    public ElElement(){
    }
    private ElElement(int number){
       this.number = number;
       id = this.hashCode();
    }
    public static long getCounter(){
        return counter;
    }
    @Override
    public long getId() {
        return id;
    }
    @Override
    public int getNumber() {
        return number;
    }
    @Override
    public void setNumber(int number){
       this.number = number;
    }
    @Override
    public void setupNumber(int number) {
        setNumber(number);
        counter++;
    }



    //test;
    static List<IElement> returnTestList(int sizeList){
        Random random = new Random();
        ArrayList<IElement> returnsTestList = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            returnsTestList.add(new ElElement(random.nextInt(10)));
        }
        return returnsTestList;
    }
}
