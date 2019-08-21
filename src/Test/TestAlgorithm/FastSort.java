package Test.TestAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**@author bobis1888 */
public class FastSort {
    private static int[] fastSort(int [] arr){
        if (arr.length<2){
            return arr;
        }

    }

    public static void main(String[] args) {
        int [] ints = new int[]{2,4,1,6,4};
        System.out.println(Arrays.toString(fastSort(ints)));
    }
}
