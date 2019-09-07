package project.TransactionSystem;

import project.TransactionSystem.Data.BankAccount;
import project.TransactionSystem.Data.MapData;

import java.util.Map;
import java.util.Scanner;

public class TSTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size mapData: =>>> ");
        int size = scanner.nextInt();
        Map<Integer, BankAccount> mapsData = MapData.getMapData(size);
        System.out.println("Select sender bank account number: =>>> ");
        int numberSends = scanner.nextInt();
        System.out.println("Select beneficiary`s bank account number: =>>> ");
        int numberGetter = scanner.nextInt();
        try {
            System.out.println(mapsData.get(numberSends).getBalance());
            System.out.println(mapsData.get(numberGetter).getBalance());
        }catch (NullPointerException e){
            System.out.println("Not found");
        }
        System.out.println("Enter sum transaction: =>>> ");
        int sum = scanner.nextInt();
        TransactionSystem.transaction(mapsData,numberSends,numberGetter,sum);
        System.out.println("*****");
        System.out.println(mapsData.get(numberSends).getBalance());
        System.out.println(mapsData.get(numberGetter).getBalance());
    }
}
