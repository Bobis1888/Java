package Study.FirstToTenChapter.TenChapter.BookTest.Controller;

public class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn(long delayTime){super(delayTime);}
        public void action(){light = true;}
        public String toString(){return "Lights is on";}
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){super(delayTime);}
        public void action(){light = false;}
        public String toString(){return "Lights is off";}
    }
    private boolean water = false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){super(delayTime);}
        public void action(){water = true;}
        public String toString(){return "Watering is on";}
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){super(delayTime);}
        public void action(){water = false;}
        public String toString(){ return "Watering is off";}
    }
    private boolean airingGH = false;
    public class AiringGreenHouseOn extends Event{
        public AiringGreenHouseOn(long delayTime){super(delayTime);}
        public void action(){airingGH = true;}
        public String toString(){return "Airing the greenhouse is running";}
    }
    public class AiringGreenHouseOff extends Event{
        public AiringGreenHouseOff(long delayTime){super(delayTime);}
        public void action(){airingGH = false;}
        public String toString(){return "Airing the greenhouse is off";}
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime){super(delayTime);}
        public void action(){thermostat = "Night";}
        public String toString(){return "Thermostat uses night mode";}
    }
    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime){super(delayTime);}
        public void action(){thermostat = "Day";}
        public String toString(){return "Thermostat uses day mode";}
    }
    public class Bell extends Event{
        public Bell(long delaytime){super(delaytime);}
        public void action(){
            addEvent(new Bell(delayTime));
        }
        public String toString(){return "BeLL!!!";}
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList){addEvent(e);}
        }
            public void action(){for (Event e:eventList) { e.start(); addEvent(e); } start(); addEvent(this); }
            public String toString(){return "System Restart";}
    }
            public static class Terminate extends Event{
        public Terminate(long delayTime){super(delayTime);}
        public void action(){System.exit(0);}
        public String toString(){return "Shutdown";}
            }
        }