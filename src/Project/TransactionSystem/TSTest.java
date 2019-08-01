package Project.TransactionSystem;

import Project.TransactionSystem.Data.BankAccount;
import Project.TransactionSystem.Data.MapData;

import java.util.Map;

public class TSTest {
    public static void main(String[] args) {
        Map<Integer, BankAccount> mapsData = MapData.getMapData(50);
        mapsData.get(20).setState(true);
        System.out.println(mapsData.get(20).getBalance());
        System.out.println(mapsData.get(21).getBalance());
        TransactionSystem.transaction(mapsData,50,51,50);
        System.out.println(mapsData.get(20).getBalance());
        System.out.println(mapsData.get(21).getBalance());
    }
}
