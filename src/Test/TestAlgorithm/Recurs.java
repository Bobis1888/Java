package Test.TestAlgorithm;

import java.util.Arrays;

public class Recurs {
    public static Integer[] recur(Integer [] arr, int start , int end){
        if (start>=end){
            return arr;
        } else {
            int medium = end/2;
            System.out.println(medium);
            System.out.println(end);
            int buffItem1;
            int buffItem2;
            for (int i = start; i < end ; i++) {
                if (arr[i]>arr[medium]){
                    buffItem1 = arr[i];
                    arr[i] = arr[medium-1];
                    arr[medium-1] = buffItem1;
                    buffItem2 = arr[medium-1];
                    arr[medium-1] = arr[medium];
                    arr[medium] = buffItem2;
                }
            }
            recur(arr,start,end/2 - 1);
            recur(arr,end/2 + 1, end);
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer [] integers = new Integer[]{4, 2, 8, 1, 3, 7, 6, 5};
        System.out.println(Arrays.toString(recur(integers,0,7)));
    }
}
