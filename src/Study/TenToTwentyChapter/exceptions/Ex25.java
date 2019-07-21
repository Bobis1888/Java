package Study.TenToTwentyChapter.exceptions;

class AException extends Exception{}
class BException extends AException{}
class CException extends BException{}

class A {
    A(){
        System.out.println("Create A");
    }
    public void a()throws AException{
        throw new AException();
    }
}
class B extends A{
    B(){
        System.out.println("Create B");
    }
    public void a()throws BException{
        throw new BException();
    }
}
class C extends B {
    C(){
        System.out.println("Create C");
    }
    public void a()throws CException{
        throw new CException();
    }
}
public class Ex25 {
    public static void main(String[] args) {
        try {
            A a = new C();
            a.a();
        }catch (AException e){
            e.printStackTrace(System.out);
        }
        }
}
