package Study.FirstToTenChapter.PolyConstructors;


class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
class RectangularGlyph extends Glyph{
    private int longer = 1;
    private int height = 1;
    RectangularGlyph(int l, int h){
        longer = l;
        height = h;
        System.out.println("RectangulatGlyph.RectangulatGlyph(), longer = " + longer + " ,height = " + height);
    }
    void draw(){
        System.out.println("RectangularGlyph.draw() , longer = " + longer + " ,height = " + height);
    }
}
public class PolyConst {
    public static void main(String[]args){
        new RoundGlyph(5);
        new RectangularGlyph(6 , 4 );
    }
}
