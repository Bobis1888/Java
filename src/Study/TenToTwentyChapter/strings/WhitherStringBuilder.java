package Study.TenToTwentyChapter.strings;

public class WhitherStringBuilder {
    public String implicit(String[] fields){
        String result = "";
        for (int i = 0; i < fields.length ; i++) {
            result += fields[i];
        }
        return result;
    }
    public String explicit(String[] fields){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            result.append(fields[i]);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"aaaa","ss","www"};
        WhitherStringBuilder whitherStringBuilder = new WhitherStringBuilder();
        String s1 = whitherStringBuilder.implicit(strings);
        String s2 = whitherStringBuilder.explicit(strings);
        System.out.println(s1);
        System.out.println(s2);
    }
}
