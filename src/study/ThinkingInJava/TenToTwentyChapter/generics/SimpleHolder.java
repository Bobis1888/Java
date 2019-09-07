package study.ThinkingInJava.TenToTwentyChapter.generics;

public class SimpleHolder {
    private Object obj;
    public void set(Object obj){this.obj = obj;}
    public Object getObj() {return obj;}

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String)holder.getObj();
    }
}
