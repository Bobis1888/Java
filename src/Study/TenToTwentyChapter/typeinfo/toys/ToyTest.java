package Study.TenToTwentyChapter.typeinfo.toys;

interface HasBatteries{}
interface Waterprof{}
interface Shoots{}
interface Qwerty{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterprof,Shoots,Qwerty{
    FancyToy(){super(1);}
}
public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Name class: " + cc.getName() + " is it Interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Study.TenToTwentyChapter.typeinfo.toys.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
            System.exit(1);
        }
        printInfo(c);
        for (Class face: c.getInterfaces())
            System.out.println(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("Failed to create an instance");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("Access denied");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
