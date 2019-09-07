package study.ThinkingInJava.util;

class Scumbria{
    public String toString(){return "Scumbria";}
}
class Scumbria2{
    public String toString(){return "Scumbria2";}
}
class Scumbria3{
    public String toString(){return "Scumbria3";}
}
class Scumbria4{
    public String toString(){return "Scumbria4";}
}
class Scumbria5{
    public String toString(){return "Scumbria5";}
}
class Scumbria6{
    public String toString(){return "Scumbria6";}
}

public class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E>{
    public F sixth;
    public SixTuple(A a,B b,C c,D d,E e,F f) {
        super(a, b, c, d, e);
        sixth = f;
    }
    public String toString(){return "(" + fifth + second + third + fourth + fifth + sixth +")";}
}
class MainMain{
    static SixTuple<Scumbria,Scumbria2,Scumbria3,Scumbria4,Scumbria5,Scumbria6> f(){
        return new SixTuple<>(new Scumbria(),new Scumbria2(),new Scumbria3(),new Scumbria4(),new Scumbria5(), new Scumbria6());
    }

    public static void main(String[] args) {
        SixTuple<Scumbria,Scumbria2,Scumbria3,Scumbria4,Scumbria5,Scumbria6> sixTuple = f();
        System.out.println(sixTuple);
        System.out.println(f());
    }
}