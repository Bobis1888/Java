package Project.TransactionSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

abstract class ReportsOnTransactions {
    public static void report(boolean stateBankAccount,int sum,int sends,int gets){
        try {
                File fileFalse = new File(
                        "/home/bobis1888/Git/Java/src/Project/TransactionSystem/Data/log","logFalse.txt");
                File fileTrue = new File(
                        "/home/bobis1888/Git/Java/src/Project/TransactionSystem/Data/log","logTrue.txt");
                FileWriter fileWriter = new FileWriter(fileTrue,true);
                FileWriter fileWriter2 = new FileWriter(fileFalse,true);
                if (stateBankAccount) {
                    fileWriter.append("\nTransaction is successful");
                    fileWriter.close();
                } else {
                    fileWriter2.append("\nTransaction is fail");
                    fileWriter2.close();
                }
            } catch (IOException e) {
                System.out.println("File not found");
            }

    }
}
