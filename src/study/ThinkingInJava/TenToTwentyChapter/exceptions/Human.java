package study.ThinkingInJava.TenToTwentyChapter.exceptions;

class Annoyance extends RuntimeException{}
class Sneeze extends Annoyance{}
class ThrowNewruntimeExept{
    void throwRuntimeException(int type){
        try {
            switch (type){
                case 0: throw new Annoyance();
                case 1: throw new Sneeze();
                case 2: throw new RuntimeException("Where I");
                default:return;
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

public class Human {
    public static void main(String[] args) {
        ThrowNewruntimeExept throwNewruntimeExept = new ThrowNewruntimeExept();
        for (int i = 0; i < 3 ; i++) {
            try {
                if (i<3){
                    throwNewruntimeExept.throwRuntimeException(i);
                }
                else {
                    throw new RuntimeException();
                }
            }catch (RuntimeException e){
                try {
                    throw e.getCause();
                }catch (Sneeze s){
                    System.out.println("Sneeze " + s);
                }catch (Annoyance a){
                    System.out.println("Annoyance " + a);
                }catch (Throwable t){
                    System.out.println("Throwable " + t);
                }
            }
        }
    }
}
