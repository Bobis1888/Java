package codewars.jun;

public class ShortString {
    public static int findShort(String s){
        String[] arrayString = s.split(" ");
        int maxLength = arrayString[0].length();
        for (String value : arrayString) {
            if (maxLength > value.length())
                maxLength = value.length();
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "bitcoin take over the world maybe who knows perhaps";
        System.out.println(findShort(s));
    }
}
