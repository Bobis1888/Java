package codewars.jun;

public class SimpleTransposition {
    public static String simpleTransposition(String text){
        int lengthString = text.length();
        int indexFirst = 0;
        int indexSecond = 1;
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        while (indexFirst < lengthString){
            string1.append(text.charAt(indexFirst));
            indexFirst+=2;
        }
        while (indexSecond < lengthString){
            string2.append(text.charAt(indexSecond));
            indexSecond+=2;
        }
        System.out.println(string1);
        System.out.println(string2);
        return String.valueOf(string1.append(string2));
    }

    public static void main(String[] args) {
        System.out.println(simpleTransposition("Simple texts"));
    }
}
