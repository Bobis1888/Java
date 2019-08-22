package Test.TestAlgorithm;

import java.util.Arrays;

/**@author bobis1888 */
public class FasterSort {
    private static void fastSort(Integer [] arr,int startStart, int endEnd){
        //если длинна его 1 то нечего сортировать
        if (arr.length<2)
            return;
        //указатели
        int start = startStart,end = endEnd;
        //индекс и значение среднего элемента
        int medium = end + (start - end) / 2, mediumValue = arr[medium];
        //пока начальный индекс не дойдет до конечного индекса
        while (start<end){
            //если левый указатель меньше medium идем дальше
            while (arr[start]<mediumValue){
                start++;
            }
            //если правый указатель меньше чем medium идем в сторону начального
            while (arr[end]>mediumValue){
                end--;
            }
            //если левый указатель меньше или равен правому то меняем местами и двигаем указатели
            if (start<=end){
                int buf = arr[start];
                arr[start] = arr[end];
                arr[end] = buf;
                start++;
                end--;
            }
        }
        //если левый указатель меньше правого указателя кооорый перемещался в сторону начала вызываем fastSort
        if (startStart<end){
            fastSort(arr,startStart,end);
        }
        //если правый указатель больще левого указателя который двигался в сторону конца вызываем fastSort
        if (endEnd>start){
            fastSort(arr,start,endEnd);
        }
    }
    public static void main(String[] args) {
        Integer [] arr = new Integer[]{4, 2, 8, 1, 3, 7, 6, 5};
        System.out.println("old " + Arrays.toString(arr));
        fastSort(arr,0,7);
        System.out.println("new " + Arrays.toString(arr));
    }
}
