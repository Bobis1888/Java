package Study.FirstToTenChapter.TenChapter.BookTest.Controller;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }
    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean readey(){
        return System.nanoTime()>= eventTime;
    }
    public abstract void action();
}
