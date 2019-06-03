package Study.Circle;

import java.util.Random;

class RandomShapeGenerator{
    private Random random = new Random();
    public Shape next(){
        switch (random.nextInt(4)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
}