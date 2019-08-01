package Project.TransactionSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

abstract class ReportsOnTransactions {
    public static void report(boolean stateBankAccount,int sum,int sends,int gets,String argumentsAccountBank){
        try {
                Date date = new Date();
                File fileFalse = new File(
                        "/home/bobis1888/Git/Java/src/Project/TransactionSystem/Data/log","logFalse.txt");
                File fileTrue = new File(
                        "/home/bobis1888/Git/Java/src/Project/TransactionSystem/Data/log","logTrue.txt");
                FileWriter fileWriter = new FileWriter(fileTrue,true);
                FileWriter fileWriter2 = new FileWriter(fileFalse,true);
                if (stateBankAccount) {
                    fileWriter.append("\n*****\nTransaction is successful \n").append(date.toString());
                    fileWriter.close();
                } else {
                    fileWriter2.append("\n*****\nTransaction is fail \n").append(date.toString()).append(argumentsAccountBank);
                    fileWriter2.close();
                }
            } catch (IOException e) {
                System.out.println("File not found");
            }

    }
}
