package study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.Controller;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        GreenhouseControlsExtends gcex = new GreenhouseControlsExtends();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gcex.new MoisturizingOn(500),
                gcex.new MoisturizingOff(550),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new AiringGreenHouseOn(1600),
                gc.new AiringGreenHouseOff(1800)
        };
        gc.addEvent(gc.new Restart(2000,eventList));
        gc.addEvent(new GreenhouseControls.Terminate(2200));
        gc.run();

    }
}
