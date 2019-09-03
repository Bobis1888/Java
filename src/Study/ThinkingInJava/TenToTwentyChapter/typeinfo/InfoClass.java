package Study.ThinkingInJava.TenToTwentyChapter.typeinfo;


import java.util.Arrays;
import java.util.Scanner;

abstract public class InfoClass {
    private static void getInfo(Class<?> c){
        System.out.println(c.getCanonicalName());
        System.out.println(c.getClassLoader());
        System.out.println(Arrays.toString(c.getClasses()));
        System.out.println(c.getSimpleName());
        System.out.println(c.getSuperclass());
        System.out.println(c.isArray());
        System.out.println(c.isMemberClass());
        System.out.println(c.isPrimitive());
        System.out.println(c.isLocalClass());
        System.out.println(c.isInterface());
    }

    public static void main(String[] args) {
        Class<?> c;
        System.out.println("Enter the package:");
        Scanner scanner = new Scanner(System.in);
        String stringScan = scanner.nextLine();
        try {
            c = Class.forName(stringScan);
            getInfo(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

