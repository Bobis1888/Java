package Study.Circle;

public class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Study.Circle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Study.Circle.erase()");
    }

    @Override
    public void amed() {
        System.out.println("Study.Circle.amed()");
    }
}
