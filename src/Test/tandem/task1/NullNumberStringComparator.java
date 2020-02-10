package Test.tandem.task1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NullNumberStringComparator implements Comparator<String> {
    //распилим строку на подстроки "числа" "не числа"
    private List<String> splitter(String line){
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+|\\D+");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find())
            result.add(matcher.group());
        return result;
    }

    //компаратор пустых знаечний
    private int voidCompare(String s1 , String s2){
        if (s1.isEmpty())
            return s2.isEmpty() ? 0 : -1;
        else
            return 1;
    }
    //нулевой компаратор
    private int nullCompare(String s1 , String s2){
        if (s1 == null)
            return s2 == null ? 0 : -1;
        else
            return 1;
    }
    //должно сработать
    private int compareSplitString(String s1 , String s2){
        Iterator<String> iterator1 = splitter(s1).iterator();
        Iterator<String> iterator2 = splitter(s2).iterator();

        while (iterator1.hasNext() && iterator2.hasNext()){
            String next1 = iterator1.next();
            String next2 = iterator2.next();
            Integer resultCompare = compareStringAsInteger(next1,next2);
            if (resultCompare != null && resultCompare != 0)
                return resultCompare;
            resultCompare = next1.compareTo(next2);
            if (resultCompare != 0)
                return resultCompare;
        }
        return Integer.compare(s1.length(),s2.length());
    }
    //если обе строки числа пытаемся их сравнить
    private Integer compareStringAsInteger(String s1 , String s2){
        Integer numberString1 = stringValueOfInteger(s1);
        Integer numberString2 = stringValueOfInteger(s2);
        if (numberString1 != null && numberString2 != null){
            return numberString1.compareTo(numberString2);
        } else {
            return null;
        }
    }
    //если строка не число вернем null тогда метод compareStringAsInteger не сработает
    private Integer stringValueOfInteger(String s){
        Integer integer;
        try {
            integer = new Integer(s);
        }catch (NumberFormatException e){
            return null;
        }
        return integer;
    }
    @Override
    public int compare(String s1, String s2) {
        if (s1 == null || s2 == null)
            return nullCompare(s1,s2);
        if (s1.isEmpty() || s2.isEmpty())
            return voidCompare(s1,s2);
        return compareSplitString(s1,s2);
    }
}
