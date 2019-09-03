package Study.ThinkingInJava.FirstToTenChapter.Shapes;

public class Shape {
        public void draw(){}
        public void erase(){}
        public void amed(){
                System.out.println("Shape.amed()");
        }
}
class Triangle extends Shape {
        @Override
        public void draw(){
                System.out.println("Triangle.draw()");
        }
        @Override
        public void erase(){
                System.out.println("Triangle.erase");
        }
        @Override
        public void amed() {
                System.out.println("Triangle.amed()");
        }
}
class Square extends Shape {
        @Override
        public void draw(){
                System.out.println("Square.draw()");
        }
        @Override
        public void erase(){
                System.out.println("Square.erase()");
        }
        @Override
        public void amed() {
                System.out.println("Square.amed()");
        }
}
class Rectangle extends Shape {
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
class Circle extends Shape {
        @Override
        public void draw(){
                System.out.println("Study.ThinkingInJava.FirstToTenChapter.Shapes.draw()");
        }
        @Override
        public void erase(){
                System.out.println("Study.ThinkingInJava.FirstToTenChapter.Shapes.erase()");
        }

        @Override
        public void amed() {
                System.out.println("Study.ThinkingInJava.FirstToTenChapter.Shapes.amed()");
        }
}

