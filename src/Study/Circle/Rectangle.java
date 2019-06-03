package Study.Circle;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase");
    }

    @Override
    public void amed() {
        System.out.println("Rectangle.amed()");
    }
}
