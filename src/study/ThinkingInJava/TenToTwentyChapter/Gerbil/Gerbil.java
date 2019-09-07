package study.ThinkingInJava.TenToTwentyChapter.Gerbil;

import java.util.*;

public class Gerbil {
    private static int x = 0;
    private int gerbilNumber;
       private Gerbil(){
        x++;
        gerbilNumber=x;
    }
    public void hop(){
        System.out.println("This Gerbil Number " + gerbilNumber);
    }
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<String, Gerbil>();
        map.put("ss",new Gerbil());
        map.put("ss1",new Gerbil());
        map.put("ss2",new Gerbil());
        map.put("ss3",new Gerbil());
        map.put("ss4",new Gerbil());
        map.put("ss5",new Gerbil());
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
            map.get(s);
        }



        }
    }

