package Project.TransactionSystem;

import Project.TransactionSystem.Data.BankAccount;
import java.util.Map;

class TransactionSystem {
    static void transaction (Map<Integer, BankAccount> mapsBankAccount,int sends, int gets, int sum){
        boolean stateTransaction = false;
       try {
           if (mapsBankAccount.get(sends).getState()&&mapsBankAccount.get(gets).getState()){
               if (mapsBankAccount.get(sends).getBalance()>sum) {
                   int sendsBalance = mapsBankAccount.get(sends).getBalance();
                   int getBalance = mapsBankAccount.get(gets).getBalance();
                   mapsBankAccount.get(sends).setBalance(sendsBalance - sum);
                   mapsBankAccount.get(gets).setBalance(getBalance + sum);
                   System.out.println("Transaction is Successful =>>>");
                   stateTransaction = true;
               } else {
                   System.out.println("Insufficient funds!!!");
               }
           }else {
               System.out.println("Bank Account №" + sends + " State: false");
           }
       } catch (NullPointerException e){
           System.out.println("Not found Bank Account number: " + sends + " or " + gets);
       }
       if (stateTransaction){
           ReportsOnTransactions.report(true,sum,sends,gets);
       } else {
           ReportsOnTransactions.report(false,sum,sends,gets);
       }
    }
}
