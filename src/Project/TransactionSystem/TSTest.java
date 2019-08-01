package Project.TransactionSystem;

import Project.TransactionSystem.Data.BankAccount;
import Project.TransactionSystem.Data.MapData;

import java.util.Map;

public class TSTest {
    public static void main(String[] args) {
        Map<Integer, BankAccount> mapsData = MapData.getMapData(50);
        try {
            System.out.println(mapsData.get(20).getBalance());
        }catch (NullPointerException e){
            System.out.println("Not founds");
        }
        System.out.println(mapsData.get(21).getBalance());
        TransactionSystem.transaction(mapsData,50,31,50);
        System.out.println(mapsData.get(20).getBalance());
        System.out.println(mapsData.get(21).getBalance());
    }
}
