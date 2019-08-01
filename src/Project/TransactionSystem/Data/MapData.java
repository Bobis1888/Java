package Project.TransactionSystem.Data;

import java.util.Map;
import java.util.TreeMap;

public class MapData {
    public static Map<Integer,BankAccount> getMapData(int size){
        Map<Integer, BankAccount> mapData = new TreeMap<>();
        for (int i = 0; i < size ; i++) {
            mapData.put(i,new BankAccount(i));
            mapData.get(i).setBalance(i+150);
        }
        return mapData;
    }
}
