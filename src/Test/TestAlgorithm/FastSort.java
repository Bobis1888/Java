package Test.TestAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**@author bobis1888 */
public class FastSort {
    private static void fastSort(int [] arr){
        if (arr.length<2){
            System.out.println(Arrays.toString(arr));
            return;
        }

    }

    public static void main(String[] args) {
        int [] ints = new int[]{2,4,1,6,4};
        fastSort(ints);
    }
}
