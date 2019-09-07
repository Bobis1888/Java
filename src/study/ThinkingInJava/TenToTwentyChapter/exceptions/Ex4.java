package study.ThinkingInJava.TenToTwentyChapter.exceptions;

public class Ex4 extends RuntimeException {
    private String s;
    Ex4(String s){ this.s = s; }
    public void ex4toprint(){ System.out.println(s); }
    public static void g() throws Ex4{
        System.out.println(" Ex4 is run. ");
        throw new Ex4("Created in g()");
    }
    public static void main(String[] args) {
            g();

    }
}
