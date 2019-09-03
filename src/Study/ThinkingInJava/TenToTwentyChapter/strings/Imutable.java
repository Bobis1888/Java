package Study.ThinkingInJava.TenToTwentyChapter.strings;

public class Imutable {
    public static String toUp(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String s1 = "sdasd";
        System.out.println(s1);
        String s2 = toUp(s1);
        System.out.println(s2);
        System.out.println(s1);
    }
}
