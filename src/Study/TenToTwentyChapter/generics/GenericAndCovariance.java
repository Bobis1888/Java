package Study.TenToTwentyChapter.generics;
 import java.util.*;
public class GenericAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
        flist.add(null);
        Fruit f = flist.get(0);
    }
}
