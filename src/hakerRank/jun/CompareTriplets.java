package hakerRank.jun;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets{
    static ArrayList<Integer> arrayResult = new ArrayList<>();
    static {
        arrayResult.add(0,0);
        arrayResult.add(1,0);
    }
    static List<Integer> compareTriplets(List<Integer> a , List<Integer> b){
        if (a.size() < 1 ||b.size() < 1){
            return arrayResult;
        }
        Integer value1 = a.get(0);
        Integer value2 = b.get(0);
        switch (value1.compareTo(value2)){
            case 0 : break;
            case 1 :    int oldValue1 = arrayResult.remove(0);
                        arrayResult.add(0,oldValue1+1);
                        break;
            case -1:    int oldValue2 = arrayResult.remove(1);
                        arrayResult.add(1,oldValue2+1);
                        break;
        }
        a.remove(0);
        b.remove(0);
        return compareTriplets(a,b);
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(17);list1.add(28);list1.add(30);
        List<Integer> list2 = new ArrayList<>();
        list2.add(99);list2.add(16);list2.add(8);
        System.out.println(compareTriplets(list1,list2));
    }
}