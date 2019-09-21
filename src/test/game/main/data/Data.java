package main.data;

import java.util.*;

//можно поменять на базу данных было бы лучше;
//все операции с этим классом производит GameKernel;
public class Data implements DataInterface {
    //имя игрока и еко очки;
    private Map<String,Integer> nameMap;
    //все полиндромы;
    private Map<String, ArrayList<String>> palindromeGamer;
    public Data() {
        nameMap = new HashMap<>();
        palindromeGamer = new HashMap<>();
    }
    @Override
    public boolean searchNameGamer(String name) {
        return nameMap.containsKey(name);
    }
    @Override
    public Integer getPointsGamer(String name){
        return nameMap.get(name);
    }
    @Override
    public void setPointsGamer(String name, Integer points) {
        if (nameMap.containsKey(name)){
            nameMap.put(name,nameMap.get(name) + points);
        } else {
            nameMap.put(name,points);
            palindromeGamer.put(name,new ArrayList<>());
        }
    }
    @Override
    public boolean rememberPalindrome(String nameGamer,String palindrome){
        ArrayList<String> remembers = palindromeGamer.get(nameGamer);
        if (!remembers.contains(palindrome)) {
            remembers.add(palindrome);
            return true;
        }
        return false;
    }
    @Override
    public void getALeaderBoard(){
        LinkedHashMap<String,Integer> leader = searchLeader((HashMap<String, Integer>) nameMap);
        System.out.println(leader);
    }
    //сортировка map по значению;
    private LinkedHashMap<String,Integer> searchLeader(HashMap<String, Integer> nameMap) {
        ArrayList<String> nameList = new ArrayList<>(nameMap.keySet());
        ArrayList<Integer> points = new ArrayList<>(nameMap.values());
        Collections.sort(points);
        Collections.reverse(points);
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for (Integer point : points) {
            Iterator<String> nameIterator = nameList.iterator();
            while (nameIterator.hasNext()) {
                String name = nameIterator.next();
                Integer int1 = nameMap.get(name);
                if (int1.equals(point)) {
                    nameIterator.remove();
                    sortedMap.put(name, point);
                    break;
                }
            }
        }
        return sortedMap;
    }
}
