package Study.ThinkingInJava.TenToTwentyChapter.exceptions;

public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null);
            }catch (Exception e){
                System.out.println("Intercepted Exception in main");
                e.printStackTrace(System.out);
            }finally {
                in.dispose();
            }
        }catch (Exception e){
            System.out.println("Build Error InputFile");
        }
    }
}
