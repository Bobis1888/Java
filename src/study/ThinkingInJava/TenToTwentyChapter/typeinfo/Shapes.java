package study.ThinkingInJava.TenToTwentyChapter.typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
    abstract public void flagOn();
    abstract public void flagOff();
}
class Circle extends Shape{
    static boolean flag = false;
    public String toString(){return "Circle " + flag;}
    public void flagOn(){flag = true;}
    public void flagOff(){flag = false;}
}
class Square extends Shape{
    static boolean flag = false;
    public String toString(){return "Square " + flag;}
    public void flagOn(){flag = true;}
    public void flagOff(){flag = false;}
}
class Triangle extends Shape{
    static boolean flag = false;
    public String toString(){return "Triangle " + flag;}
    public void flagOn(){flag = true;}
    public void flagOff(){flag = false;}
}
class Rhomboid extends Shape{
    static boolean flag = false;
    public String toString(){return "Rhomboid " + flag;}
    public void flagOn(){flag = true;}
    public void flagOff(){flag = false;}
}
public class Shapes{
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c2 = new Circle();
        Square s = new Square();
        Square s2 = new Square();
        Triangle t = new Triangle();
        Triangle t2 = new Triangle();
        Rhomboid r = new Rhomboid();
        Rhomboid r2 = new Rhomboid();
        c.flagOn();s.flagOn();t.flagOn();r.flagOn();
        List<Shape> shapeList = Arrays.asList(c,c2,s,s2,t,t2,r,r2);
        for (Shape shape:shapeList) {
            System.out.println(shape);
        }
    }
    }

