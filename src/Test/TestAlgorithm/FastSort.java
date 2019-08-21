package Test.TestAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**@author bobis1888 */
public class FastSort {
    private static int[] fastSort(int [] arr){
        if (arr.length<2){
            return arr;
        }else {
            int medium = arr[arr.length / 2];
            ArrayList<Integer> lowIfMedium = new ArrayList<>();
            ArrayList<Integer> upIfMedium = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (medium <= arr[i]) {
                    lowIfMedium.add(i);
                } else {
                    upIfMedium.add(i);
                }
            }
            int[] lowNumber = new int[lowIfMedium.size()];
            int[] uprNumber = new int[upIfMedium.size()];
            for (int i = 0; i < lowIfMedium.size(); i++) {
                lowNumber[i] = lowIfMedium.get(i);
            }
            for (int i = 0; i < upIfMedium.size(); i++) {
                uprNumber[i] = upIfMedium.get(i);
            }
            }
    }

    public static void main(String[] args) {
        int [] ints = new int[]{2,4,1,6,4};
        System.out.println(Arrays.toString(fastSort(ints)));
    }
}
