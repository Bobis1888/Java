package study.ThinkingInJava.TenToTwentyChapter.strings;

public class DataBaseException extends Exception {
    public DataBaseException(int transactionID, int queryID, String message){
        super(String.format("(t%d,q%d) %s",transactionID,queryID,message));
    }

    public static void main(String[] args) {
        try {
            throw new DataBaseException(3,7,"Record error");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
