package test.task2;

public class ElElement implements IElement {
    private static long counter = 0;
    private int number = 0;
    private long id = 0;
    public ElElement(){
    }
    ElElement(int number){
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
}
