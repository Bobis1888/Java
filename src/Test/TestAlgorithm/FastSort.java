package Test.TestAlgorithm;

import java.util.Arrays;
/**@author bobis1888 */
public class FastSort {
    public static void fastSort(Integer[] arr, int start , int end){
        if (start>=end)
            System.out.println(Arrays.toString(arr));
        int s = start;
        int e = end;
        int medium = e + (s - e)/2;
        int mediumValue = arr[medium];
        while (s<e){
            while (arr[s]<mediumValue){
                s++;
            }
            while (arr[e]>mediumValue){
                e--;
            }
            if (s<=e){
                int buff = arr[s];
                arr[s] = arr[e];
                arr[e] = buff;
                s++;
                e--;
            }
        }
        if (start<e){
            fastSort(arr,start,e);
        }
        if (end>s){
            fastSort(arr,s,end);
        }
        }


    public static void main(String[] args) {
        Integer [] arr = new Integer[]{4, 2, 8, 1, 3, 7, 6, 5};
        fastSort(arr,0,7);
        System.out.println(Arrays.toString(arr));
    }
}
