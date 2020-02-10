package Test.tandem.task1;

import java.util.Comparator;

public class RComparator implements Comparator<String[]> {
    private int index;
    public void setIndex(int index){
        this.index = index;
    }
    RComparator(int index){
        setIndex(index);
    }
    @Override
    public int compare(String[] o1, String[] o2) {
       NullNumberStringComparator nullNumberStringComparator = new NullNumberStringComparator();
       return nullNumberStringComparator.compare(o1[index],o2[index]);
    }

}
