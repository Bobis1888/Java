package Study.TenToTwentyChapter.generics;

class GenericSetter<T>{
    void set(T arg){
        System.out.println("GS.set(T)");
    }
}
class DerivedGS extends GenericSetter<Base>{
    void set(Derived derived){
        System.out.println("DGS.set(Derived)");
    }
}
public class PlainGenericInheritance {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS derivedGS = new DerivedGS();
        derivedGS.set(derived);
        derivedGS.set(base);
    }
}
