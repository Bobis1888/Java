package study.ThinkingInJava.TenToTwentyChapter.generics;

import java.util.Date;

interface TimeStamped{
    long getStamped();
}

class TimeStampedImp implements TimeStamped{
    private final long timeStamp;
    public TimeStampedImp(){
        timeStamp = new Date().getTime();
    }
    public long getStamped(){
        return timeStamp;
    }
}
interface SerialNumbered{
    long getSerialNumber();
}
class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;
    public long getSerialNumber() {
        return serialNumber;
    }
}
interface Basic{
    public void set(String val);
    public String get();
}
class BasicImp implements Basic{
    private String value;
    public void set(String val) {
        value = val;
    }
    public String get() {
        return value;
    }
}
class Mixin extends BasicImp implements TimeStamped,SerialNumbered{
    private TimeStamped timeStamped = new TimeStampedImp();
    private SerialNumbered serialNumbered = new SerialNumberedImp();
    public long getStamped() {
        return timeStamped.getStamped();
    }
    public long getSerialNumber() {
        return serialNumbered.getSerialNumber();
    }
}
public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(),mixin2 = new Mixin();
        mixin1.set("test String1");
        mixin2.set("test String2");
        System.out.println(mixin1.get() + " " + mixin1.getStamped() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamped() + " " + mixin2.getSerialNumber());
    }
}
