package MyP.MyTest;

public class Counter {
    private static int counter = 0;
    private int iD = counter++;
    static {
        counter++;
    }
    public void id(){
        System.out.println(iD);
    }
}


