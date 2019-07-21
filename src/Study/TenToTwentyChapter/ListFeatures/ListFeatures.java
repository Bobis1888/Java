package Study.TenToTwentyChapter.ListFeatures;

import java.util.*;

class MyInteger{
    static public Random random = new Random();

    private static String randomString(){
        switch (random.nextInt(6)){
            case 0: return "String0";
            case 1: return "String1";
            case 2: return "String2";
            case 3: return "String3";
            case 4: return "String4";
            case 5: return "String5";
            default: return null;
        }
    }

    static ArrayList<String> arrayList(int a){
        ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < a ; i++) {
                strings.add(randomString());
            }
        return strings;
    }
}

public class ListFeatures {
    public static void main(String[] args) {
        List<String> integer = MyInteger.arrayList(7);
        System.out.println("1: " + integer);
        String h = "h";
        integer.add(h);
        System.out.println("2: " + integer);
        System.out.println("3: " + integer.contains(h));
        integer.remove(h);
        String p = integer.get(2);
        System.out.println("4: " + p + integer.indexOf(p));
        String cymric = "cymric";
        System.out.println("5: " + integer.indexOf(cymric));
        System.out.println("6: " + integer.remove(cymric));
        System.out.println("7: " + integer.remove(p));
        System.out.println("8: " + integer);
        integer.add(3 , "add.index(3)");
        System.out.println("9: " + integer);
        List<String> sub = integer.subList(1,4);
        System.out.println("Partial list: " + sub);
        System.out.println("10: " + integer.containsAll(sub));
        Collections.sort(sub);
        System.out.println("After sort: " + sub);
        System.out.println("11: " + integer.containsAll(sub));
        Collections.shuffle(sub, MyInteger.random);
        System.out.println("After shuffle: " + sub);
        System.out.println("12: " + integer.containsAll(sub));
        List<String> copy = new ArrayList<String>(integer);
        sub = Arrays.asList(integer.get(1),integer.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(integer);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1,"copy.set(1)");
        System.out.println("16: " + copy);
        copy.addAll(2,sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + integer.isEmpty());
        integer.clear();
        System.out.println("19: " + integer);
        System.out.println("20: " + integer.isEmpty());
        integer.addAll(MyInteger.arrayList(4));
        System.out.println("21: " + integer);
        Object[] o = integer.toArray();
        System.out.println("22: " + o[3]);
        String[] pa = integer.toArray(new String[0]);
        System.out.println("23: " + pa[3].toString());
    }
}
