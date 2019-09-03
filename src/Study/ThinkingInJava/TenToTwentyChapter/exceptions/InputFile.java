package Study.ThinkingInJava.TenToTwentyChapter.exceptions;

import java.io.*;

public class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception{
        try {
            in = new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException e){
            System.out.println("Could not open " + fname);
            throw e;
        }catch (Exception e){
            try {
                in.close();
            }catch (IOException e2){
                System.out.println("Runtime Error in.close()");
            }
            throw e;
        }finally {

        }
    }
    public String getLine(){
        String s;
        try {
            s = in.readLine();
        }catch (IOException e){
            throw new RuntimeException("Runtime Error readLine()");
        }
        return s;
    }
    public void dispose(){
        try {
            in.close();
            System.out.println("dispose() successful");
        }catch (IOException e2){
            throw new RuntimeException("Runtime in.close()");
        }
    }
}
