package Study.ThinkingInJava.TenToTwentyChapter.exceptions;

class ParentException extends Exception{}

class Parent{
    public Parent()throws ParentException{
        throw new ParentException();
    }
}
public class Ex21  extends Parent{
    public Ex21() throws ParentException{
        try {
            Parent parent = new Parent();
        }catch (ParentException e){
            System.out.println("Base ");
        }
    }

    public static void main(String[] args) {
        try{
            Ex21 test = new Ex21();
        }catch (ParentException e){
            System.out.println(e);
        }
    }
  }

