package study.ThinkingInJava.TenToTwentyChapter.typeinfo;

public class Ex8 {
    public static void objectHierarchi(Object o){
        if (o.getClass().getSuperclass() != null){
            System.out.println(o.getClass() + "is a subclass of " + o.getClass().getSuperclass());
            System.out.println(o.getClass().getDeclaredFields());
            try {
                objectHierarchi(o.getClass().getSuperclass().newInstance());
            }catch (InstantiationException e){
                e.printStackTrace();
                System.out.println("Fuck Errors");
            }catch (IllegalAccessException e){
                e.printStackTrace();
                System.out.println("Fuck Access");
            }
        }
    }


    public static void main(String[] args) {
        Circle c = new Circle();
        objectHierarchi(c);
    }
}
