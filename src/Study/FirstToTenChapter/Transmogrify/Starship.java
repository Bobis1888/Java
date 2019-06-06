package Study.FirstToTenChapter.Transmogrify;

class Ship{
    public void doIt(){
        System.out.println("I`m ready to fly");
    }
}
class RunShip extends Ship{
    public void doIt(){
        System.out.println("I can fly");
    }
}
class StopShip extends Ship{
    public void doIt(){
        System.out.println("Stop machine");
    }
}
class SoSShip extends Ship{
    public void doIt() {
        System.out.println("SoS,Sos,SoS");
    }
}
class StageShip{
    private Ship ship = new Ship();
    public void runShip(){
        ship = new RunShip();
    }
    public void stopShip(){
        ship = new StopShip();
    }
    public void sos(){
        ship = new SoSShip();
    }
    public void radio(){
        ship.doIt();
    }
}
public class Starship {
    public static void main(String[] args) {
        StageShip starStageShip = new StageShip();
        starStageShip.radio();
        starStageShip.runShip();
        starStageShip.radio();
        starStageShip.stopShip();
        starStageShip.radio();
        starStageShip.sos();
        starStageShip.radio();
    }
}
