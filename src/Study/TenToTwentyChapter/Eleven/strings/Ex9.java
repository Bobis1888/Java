package Study.TenToTwentyChapter.Eleven.strings;

public class Ex9 {
    public static void main(String[] args) {
        String s1 = Splitting.knights;
        System.out.println(s1.replaceAll("[aeyuioAEYUIO]","_"));
    }
}
