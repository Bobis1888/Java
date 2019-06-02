package Cycle;

class Cycle {
    void wheel(){}
}
class Unicycle extends Cycle{
    void wheel(){
        System.out.println("One wheel");
    }
    void balance(){
        System.out.println("Balance unicycle");
    }
}
class Bicycle extends Cycle{
    void wheel(){
        System.out.println("Two wheels");
    }
    void balance(){
        System.out.println("Balance bicycle");
    }
}
class Tricycle extends Cycle{
    void wheel(){
        System.out.println("Three wheels");
    }
}
