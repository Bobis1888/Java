package Study.TenToTwentyChapter.typeinfo;

public class Ex10 {
    public static void main(String[] args) {
        char[] chars = new char[10];
        System.out.println(chars.getClass().getSuperclass());
        System.out.println(chars instanceof Object);
    }
}
