package Study.TenToTwentyChapter.generics;

interface FirstInterface{
    void methodFirstInterface();
}
interface SecondInterface{
    void methodSecondInterface();
}
class RealInterfaceClass implements FirstInterface,SecondInterface{
    String name = "John";
    public void methodFirstInterface() {
        System.out.println("methodFirstInterface()");
    }
    public void methodSecondInterface() {
        System.out.println("methodSecondInterface()");
    }
}
public class Ex25 {
    static <T extends FirstInterface> void printName(T item){
        item.methodFirstInterface();
    }
    static <T extends SecondInterface> void printName2(T item){
        item.methodSecondInterface();
    }

    public static void main(String[] args) {
        RealInterfaceClass realInterfaceClass = new RealInterfaceClass();
        realInterfaceClass.methodFirstInterface();
        realInterfaceClass.methodSecondInterface();
        printName(realInterfaceClass);
        printName2(realInterfaceClass);
    }
}
