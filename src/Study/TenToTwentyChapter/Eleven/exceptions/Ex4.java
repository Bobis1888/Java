package Study.TenToTwentyChapter.Eleven.exceptions;

public class Ex4 extends Exception {
    private String s;
    Ex4(String s){ this.s = s; }
    public void ex4toprint(){ System.out.println(s); }
    public static void g() throws Ex4{
        System.out.println(" Ex4 is run. ");
        throw new Ex4("Created in g()");
    }
    public static void main(String[] args) {
        try {
            g();
        }catch (Ex4 e){
            e.printStackTrace(System.err);
        }
    }
}