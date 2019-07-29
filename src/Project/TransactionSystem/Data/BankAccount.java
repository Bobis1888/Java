package Project.TransactionSystem.Data;

import java.util.*;

public class BankAccount {
    private static int count = 0;
    private int number,balance;
    private boolean state = true;
    private BankAccount(int number){
        this.number = number;
        balance = 0;
        count++;
    }
    //generator unique number for getBankAccount
    private static Set<Integer> getRandomNumber(int size){
        Set<Integer> setBankAccount = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < size ; i++) {
            int randInt = random.nextInt(9999);
            if (randInt!=0){
            setBankAccount.add(randInt);
        }
    }
        return setBankAccount;
    }
    public static List<BankAccount> getBankAccount(int size){
        List<BankAccount> bankAccountList = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            bankAccountList.add(new BankAccount((getRandomNumber(size).iterator().next())));
        }
        return bankAccountList;
    }
    public static int getCount() {return count;}
    public int getNumber(){return number;}
    public int getBalance(){return balance;}
    public void setBalance(int balance){
        if (state) {
            this.balance = balance;
        }
    }
    public boolean getState(){return state;}
    public void setState(boolean state){this.state = state;}
    public String toString(){
        return String.valueOf(number);
    }
}
