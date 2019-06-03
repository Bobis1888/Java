package Study.Abstract;

abstract class Abstract {
}
class NoAbstract extends Abstract {
    void print(){
        System.out.println("NoAbstract");
    }
}
abstract class Abstract2{
    abstract void print();
}
class NoAbstract2 extends Abstract2{
    void print(){
        System.out.println("NoAbstract2");
    }

}
class Test{
    static void noAbstr(Abstract2 i){
        i.print();
    }

    public static void main(String[] args) {
        NoAbstract2 noAbstract2 = new NoAbstract2();
        noAbstract2.print();
        Test.noAbstr(noAbstract2);
    }
}
