package Test.TestAlgorithm;

import java.util.Arrays;
/**@author bobis1888 */
public class FastSort {
    private static void fastSort(Integer[] arr, int start, int end){
        if (start>=end)
            return;
        int start1 = start;
        int end1 = end;
        //select medium item
        int medium = end1 + (start1 - end1)/2;
        //remember value medium item
        int mediumValue = arr[medium];
        while (start1<end1){
            while (arr[start1]<mediumValue){
                start1++;
            }
            while (arr[end1]>mediumValue){
                end1--;
            }
            if (start1<=end1){
                int buff = arr[start1];
                arr[start1] = arr[end1];
                arr[end1] = buff;
                start1++;
                end1--;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (start<end1){
            fastSort(arr,start,end1);
        }
        if (end>start1){
            fastSort(arr,start1,end);
        }
        }


    public static void main(String[] args) {
        Integer [] arr = new Integer[]{4, 2, 8, 1, 3, 7, 6, 5};
        fastSort(arr,0,7);
        System.out.println(Arrays.toString(arr));
    }
}
