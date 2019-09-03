package Study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.ProtectedInnerClass;

public class Parce18{
    public Wrapping wrapping(int x){
    return new Wrapping(x){
        public int value(){
            return super.value()*47;
        }
    };
    }

    public static void main(String[] args) {
        Parce18 p = new Parce18();
        Wrapping w = p.wrapping(10);
    }
    }
