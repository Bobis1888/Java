package BinarySearh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BinarySearch binSearch = new BinarySearch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the number>>>");
        int scanArrayNumberItems = scanner.nextInt();
        System.out.println("Enter key>>>");
        int key = scanner.nextInt();

        int [] array = new int[scanArrayNumberItems];
        for (int i = 0; i <array.length ; i++) {
            array[i]=i+1;
        }

        if (binSearch.methoodBinarySearch(key,array)==0){
            System.out.println("Not found");
        } else {
            System.out.println("Key == " + binSearch.methoodBinarySearch(key,array));
        }
    }
}