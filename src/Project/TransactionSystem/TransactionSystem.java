package Project.TransactionSystem;

import Project.TransactionSystem.Data.BankAccount;
import java.util.Map;

class TransactionSystem {
    static void transaction (Map<Integer, BankAccount> mapsBankAccount,int sends, int gets, int sum){
        boolean stateTransaction = false;
        String argumentsAccountBank = "";
       try {
           if (mapsBankAccount.get(sends).getState()&&mapsBankAccount.get(gets).getState()){
               if (mapsBankAccount.get(sends).getBalance()>sum) {
                   int sendsBalance = mapsBankAccount.get(sends).getBalance();
                   int getBalance = mapsBankAccount.get(gets).getBalance();
                   mapsBankAccount.get(sends).setBalance(sendsBalance - sum);
                   mapsBankAccount.get(gets).setBalance(getBalance + sum);
                   System.out.println(" Transaction is Successful =>>>");
                   stateTransaction = true;
               } else {
                   argumentsAccountBank = " Insufficient funds";
                   System.out.println(argumentsAccountBank + "!!!");
               }
           }else {
               argumentsAccountBank = " Bank account State: false";
               System.out.println(argumentsAccountBank);
           }
       } catch (NullPointerException e){
           argumentsAccountBank = " Not found Bank Account";
           System.out.println(argumentsAccountBank + " number");
       }
       if (stateTransaction){
           ReportsOnTransactions.report(true,sum,sends,gets,argumentsAccountBank);
       } else {
           ReportsOnTransactions.report(false,sum,sends,gets,argumentsAccountBank);
       }
    }
}
