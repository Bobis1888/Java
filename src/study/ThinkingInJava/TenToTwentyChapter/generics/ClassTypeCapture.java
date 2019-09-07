package study.ThinkingInJava.TenToTwentyChapter.generics;

import java.util.HashMap;
import java.util.Map;

class Building{
    public String toString(){return "It`s Building";}
}
class House extends Building{
    public String toString(){return "It`s House";}
}
public class ClassTypeCapture<T>{
    Class<T> kind;
    Map<String,Class<?>> map;
    public ClassTypeCapture(Class<T> kind,Map<String,Class<?>> map){
        this.kind = kind;
        this.map = map;
    }
    public boolean f(Object arg){
        return kind.isInstance(arg);
    }
    public void addType(String typename,Class<?> kind){
        map.put(typename,kind);
    }
    public Object createNew(String typename) throws Exception {
        if (map.containsKey(typename)){
            return map.get(typename).newInstance();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctc1 = new ClassTypeCapture<>(Building.class,new HashMap<>());
        ctc1.addType("House",House.class);
        ctc1.addType("Building",Building.class);
        try {
            System.out.println(ctc1.createNew("House"));
            System.out.println(ctc1.createNew("B"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
