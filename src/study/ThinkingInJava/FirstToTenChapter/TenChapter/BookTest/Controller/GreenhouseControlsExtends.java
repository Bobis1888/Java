package study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.Controller;

public class GreenhouseControlsExtends extends GreenhouseControls{
    private boolean moisturizing = false;
    public class MoisturizingOn extends Event{
        public MoisturizingOn(long dalaytime){super(dalaytime);}
        public void action(){moisturizing = true;}
        public String toString(){return "Moisturizing is running";}
    }
    public class MoisturizingOff extends Event{
        public MoisturizingOff(long delayTime){super(delayTime);}
        public void action(){moisturizing = false;}
        public String toString(){return "Moisturizing is Off";}
    }
}
