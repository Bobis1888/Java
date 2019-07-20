package codewars.jun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {
    public static int[] sortArray(int [] array){
        if (array.length<0){
            return array;
        }else {
            List<Integer> keys = new ArrayList<>();
            List<Integer> value= new ArrayList<>();
            for (int i = 0; i < array.length ; i++) {
                if (array[i]%2 != 0){
                            value.add(array[i]);
                            keys.add(i);
                }
            }
            Collections.sort(value);
            for (int j = 0; j < keys.size() ; j++) {
                array[keys.get(j)]=value.get(j);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{5, 3, 1, 8, 0,5,1,7,3,2,5,1};
        sortArray(ints);
        for (int i:ints) {
            System.out.print(i);
        }
    }
}
/*
You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.

Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

Example

sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
*/
