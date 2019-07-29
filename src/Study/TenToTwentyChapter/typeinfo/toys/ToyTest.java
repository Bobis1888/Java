package Study.TenToTwentyChapter.typeinfo.toys;
import java.lang.reflect.*;

interface HasBatteries{}
interface Waterprof{}
interface Shoots{}
interface Qwerty{}

class Toy{
    Toy(){
        System.out.println("Create Toy() obj");
    }
    Toy(int i){
        System.out.println("Create Toy(" + i + ") obj");
    }
}

class FancyToy extends Toy implements HasBatteries,Waterprof,Shoots,Qwerty{
    FancyToy(){super(1);}
}
public class ToyTest {
    public static void main(String[] args) {
        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(1);
        }catch (NoSuchMethodException e){
            System.out.println("No such method " + e);
        }catch (InstantiationException e){
            System.out.println("InstantinationEx " + e);
        }catch (IllegalAccessException e){
            System.out.println("IllegalAccessEx " + e);
        }catch (InvocationTargetException e){
            System.out.println("ITE " + e);
        }
    }
}
