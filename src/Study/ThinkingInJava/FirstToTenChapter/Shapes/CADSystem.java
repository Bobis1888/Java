package Study.ThinkingInJava.FirstToTenChapter.Shapes;

class NewShapes {
    NewShapes(int i){
        System.out.println("NewShape Constructor    ");
    }
    void dispose(){
        System.out.println("Shape dispose");
    }
}
class NewCircle extends NewShapes {
    NewCircle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
    void dispose(){
        System.out.println("Erasing Circle");
        super.dispose();
    }
}
class NewTriangle extends NewShapes{
    NewTriangle(int i){
        super(i);
        System.out.println("Drawing Triangle");
    }
    void dispose(){
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}
class Line extends NewShapes{
    private int start,end;
    Line(int start,int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing line: " + start + ", " + end);
    }
    void dispose(){
        System.out.println("Erasing line: " + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem extends NewShapes{
    private NewCircle circle;
    private NewTriangle triangle;
    private Line[] lines = new Line[3];
        public CADSystem(int i){
            super(i+1);
            for (int j = 0; j < lines.length ; j++) {
                lines[j] = new Line(j,j*j);
            }
            circle = new NewCircle(1);
            triangle = new NewTriangle(1);
            System.out.println("Combined Constructor");
        }
        public void dispose(){
            System.out.println("CADSystem.dispose()");
            triangle.dispose();
            circle.dispose();
            for (int i = 0; i < lines.length ; i++) {
                lines[i].dispose();
            }
            super.dispose();
        }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            System.out.println("returning from try block");
        }finally {
            x.dispose();
        }
    }
}
