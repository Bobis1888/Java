package Project.TransactionSystem;

import  Project.TransactionSystem.Data.BankAccount;
import java.util.List;

public class TransactionSystem {
    private int searchSendsNumber(int sends,List<BankAccount> dataBankAccount){
        int findNumber = 0;
        for (int i = 0; i < dataBankAccount.size() ; i++) {
            if (dataBankAccount.get(i).getState()){
                if (dataBankAccount.get(i).getNumber()==sends){
                    findNumber = i;
                }
            }
        }
        return findNumber;
    }
    public static void transaction(int sends,int gets,int sum){

    }
    public static void main(String[] args) {
        List<BankAccount> dataBankAccounts = BankAccount.getBankAccount(1000);
        for (BankAccount ba:dataBankAccounts) {
            System.out.println(ba.getNumber());
        }



    }
}
