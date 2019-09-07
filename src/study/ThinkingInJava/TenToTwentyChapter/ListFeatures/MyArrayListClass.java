package study.ThinkingInJava.TenToTwentyChapter.ListFeatures;

import java.util.*;


public class MyArrayListClass {
   private String name = "Object";
   private static int id;
   private int current;
   public MyArrayListClass(){
       id++;
       current = id;
   }
   public void getName(){
       System.out.println(name + " №" + current);
   }
   public static ArrayList<MyArrayListClass> getArrayList(int size){
       ArrayList<MyArrayListClass> arraylist = new ArrayList<MyArrayListClass>();
       for (int i = 0; i < size ; i++) {
           arraylist.add(i,new MyArrayListClass());
       }
       return arraylist;
   }

    public static void main(String[] args) {
    MyArrayListClass[] arrayListClasses = {
            new MyArrayListClass(),
            new MyArrayListClass(),
            new MyArrayListClass(),
            new MyArrayListClass(),
            new MyArrayListClass()
    };
    List<MyArrayListClass> listClasses = new ArrayList<MyArrayListClass>(Arrays.asList(arrayListClasses));
    List<MyArrayListClass> subList = listClasses.subList(0,2);
    listClasses.removeAll(subList);
        for (MyArrayListClass s:listClasses) {
            s.getName();
        }
   }
}
