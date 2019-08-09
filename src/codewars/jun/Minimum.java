package codewars.jun;

import java.util.ArrayList;
import java.util.Collections;

public class Minimum {
    private static String getChar(int[] values) {
        StringBuilder charList = new StringBuilder();
        for (int i : values)
            charList.append(i);
        return String.valueOf(charList);
    }

    private static int[] sortArray(int[] values) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i : values) {
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        int s = 0;
        for (Integer integer : arrayList) {
            if (!integer.equals(s)) {
                arrayList1.add(integer);
                s = integer;
            }
        }
        int[] newInt = new int[arrayList1.size()];
        for (int i = 0; i < newInt.length; i++) {
            newInt[i] = arrayList1.get(i);
        }
        return newInt;
    }

    public static int minValue(int[] values) {
        values = sortArray(values);
        String s = getChar(values);
        return Integer.parseInt(s);
    }
}