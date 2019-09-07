package project.TransactionSystem.Data;

public class BankAccount {
    private static int count = 0;
    private int number,balance;
    private boolean state = true;
    BankAccount(int number){
        this.number = number;
        balance = 0;
        count++;
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
