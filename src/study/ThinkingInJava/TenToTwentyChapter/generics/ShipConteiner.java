package study.ThinkingInJava.TenToTwentyChapter.generics;

import study.ThinkingInJava.util.Generator;

import java.util.ArrayList;

class Container{
    private static long counter = 1;
    private final long id = counter++;
    private long rowNumber;
    private String description;
    private long lvlNumber;
    private Container(String description){
        this.description = description;
    }
    public void setRowNumber(long rowNumber){
        this.rowNumber = rowNumber;
    }
    public void setLevelNumber(long lvlNumber){
        this.lvlNumber = lvlNumber;
    }
    public String toString(){return description + " RowNumber: " + rowNumber + " LVLNumber: " + lvlNumber + " ID: " + id;}
    public static Generator<Container> generator = new Generator<>() {
        @Override
        public Container next(){
            return new Container("Container: ");
        }
    };
}
class Level extends ArrayList<Container>{
    private static long counter = 1;
    private final long id = counter++;
    public Level(int size,long rowNumber){
        Generators.fill(this,Container.generator,size);
        for (Container c : this){
            c.setLevelNumber(id);
            c.setRowNumber(rowNumber);
        }
    }
}

class Row extends ArrayList<Level> {
    private static long counter = 1;
    private final  long id = counter++;

    public Row(int sizeRow,int size){
        for (int i = 0; i < sizeRow ; i++) {
            add(new Level(size,id));
        }
    }
}

public class ShipConteiner extends ArrayList<Row>{
    public ShipConteiner(int nRow,int nLevel,int container){
        for (int i = 0; i < nRow; i++) {
            add(new Row(nLevel,container));
        }
        }
        public String toString(){
            StringBuilder result = new StringBuilder();
            for (Row r : this)
                for (Level l : r)
                    for (Container c : l){
                        result.append(c);
                        result.append("\n");
                    }
            return result.toString();
        }

    public static void main(String[] args) {
        System.out.println(new ShipConteiner(10,4,10));
    }
    }

