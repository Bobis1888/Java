package Study.ThinkingInJava.FirstToTenChapter.TenChapter.MyTest.TwentyOne;

interface U{
    void sayU();
    void getU();
    void setU();
}
class A{
    A(){}
    protected U retU(){
        return new U() {
            public void sayU() {
                System.out.println("sayU()");
            }
            public void getU() {
                System.out.println("getU()");
            }
            public void setU() {
                System.out.println("setU()");
            }
        };
    }

}
class B{
    protected int i = 0;
    private U[] arrayU;
    B(int size){
        arrayU = new U[size];
    }
    protected void arrayAddU(U u){
        if (i<arrayU.length)
            arrayU[i] = u;
            i++;
    }
    protected void clearU(int x){
        arrayU[x] = null;
    }
    protected void callMethodU(){
        for (int j = 0; j <arrayU.length ; j++) {
            arrayU[j].getU();
            arrayU[j].sayU();
            arrayU[j].setU();
        }
    }

    public static void main(String[] args) {
        A a  = new A();
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        B b = new B(6);
        b.arrayAddU(a.retU());
        b.arrayAddU(a1.retU());
        b.arrayAddU(a2.retU());
        b.arrayAddU(a3.retU());
        b.arrayAddU(a4.retU());
        b.arrayAddU(a5.retU());
        b.arrayU[0].setU();
        b.arrayU[1].getU();
        b.arrayU[2].sayU();
        b.arrayU[3].setU();
        b.arrayU[4].getU();
        b.arrayU[5].sayU();
        b.callMethodU();
        b.clearU(3);
        System.out.println(b.arrayU[3]);
    }
}
