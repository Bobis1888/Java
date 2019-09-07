package study.ThinkingInJava.TenToTwentyChapter.generics;

interface  Playable22{
    void test();
}
class Employee22 implements Playable22{
    public void test(){
        System.out.println("test()");
    }
}
class Hourly extends Employee22 implements Playable22{

}
public class MultipleInterfaceVariants{
    public static void main(String[] args) {
        Hourly hourly = new Hourly();
        hourly.test();
    }
}
