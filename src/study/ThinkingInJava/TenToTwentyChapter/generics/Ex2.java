package study.ThinkingInJava.TenToTwentyChapter.generics;

class ObjectOne{
    public String toString(){return "ObjectOne";}
}
class ObjectSecond{
    public String toString(){return "ObjectSecond";}
}
class ObjectThree{
    public String toString(){return "ObjectThree";}
}

public class Ex2 {

        private ObjectOne oo;
        private ObjectSecond os;
        private ObjectThree ot;

    public Ex2(ObjectOne oo,ObjectSecond os,ObjectThree ot){
        this.oo = oo;
        this.os = os;
        this.ot = ot;
    }

    public ObjectOne getOO() {return oo;}
    public ObjectSecond getOS() {return os;}
    public ObjectThree getOT() {return ot;}
    public void setOo(ObjectOne oo) {this.oo = oo;}
    public void setOS(ObjectSecond os) {this.os = os;}
    public void setOT(ObjectThree ot) {this.ot = ot;}

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2(new ObjectOne(),new ObjectSecond(),new ObjectThree());
        System.out.println(ex2.getOO());
        System.out.println(ex2.getOS());
        System.out.println(ex2.getOT());
    }
}

