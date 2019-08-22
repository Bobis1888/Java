package Test.TestAlgorithm;

import java.util.Arrays;

/**@author bobis1888 */
public class FastSort {

    private static Integer [] fastSort(Integer[] arr){
        if (arr.length<2) {
            return arr;
        }else if (arr.length == 2){
            int buffArrItem;
            if (arr[0]>arr[1]){
                buffArrItem = arr[0];
                arr[0] = arr[1];
                arr[1] = buffArrItem;
                return arr;
            }
        } return qSort(arr);
    }
    private static Integer [] qSort(Integer[] integers){

        return integers;
    }


    public static void main(String[] args) {
        Integer [] integers = new Integer[]{4, 2, 8, 1, 3, 7, 6, 5};
        System.out.println(Arrays.toString(fastSort(integers)));
    }
}
