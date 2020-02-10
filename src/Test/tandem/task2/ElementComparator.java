package Test.tandem.task2;

import java.util.Comparator;

public class ElementComparator implements Comparator<IElement> {
    @Override
    public int compare(IElement o1, IElement o2) {
        int idElement1 = o1.getNumber();
        int idElement2 = o2.getNumber();
        return Integer.compare(idElement1, idElement2);
    }
}
