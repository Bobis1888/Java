package Study.TenToTwentyChapter.generics;
/** @author bobis1888 */
interface FactoryI<T>{
    T create(int size);
}

class Foo2<T>{
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory){
        x = factory.create(5);
    }
}

class IntegerFactory implements FactoryI<Integer>{
    public Integer create(int size){
        return new Integer(size);
    }
}
class Widget{
    public static class Factory implements FactoryI<Widget>{
        public Widget create(int size){
            return new Widget();
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
