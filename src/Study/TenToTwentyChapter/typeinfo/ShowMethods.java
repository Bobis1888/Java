package Study.TenToTwentyChapter.typeinfo;

import java.lang.reflect.*;
import java.util.regex.*;

class ShowMethods {
    private static String usage =
            "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("(\\w+\\.)|\\s*native|\\s*final");

    public static void main(String[] args) {
            if (args.length<1){
                System.out.println(usage);
                System.exit(0);
            }
            int lines = 0;
            try {
                Class<?> c = Class.forName(args[0]);
                Method[] methods = c.getMethods();
                Constructor[] ctors = c.getConstructors();
                if (args.length==1){
                    for (Method m:methods) {
                        System.out.println(p.matcher(m.toString()).replaceAll(""));
                    }
                    for (Constructor ctr:ctors) {
                        System.out.println(p.matcher(ctr.toString()).replaceAll(""));
                    }
                    lines = methods.length + ctors.length;
                }else {
                    for (Method method:methods) {
                        if (method.toString().indexOf(args[1])!=-1){
                            System.out.println(p.matcher(method.toString()).replaceAll(""));
                            lines++;
                        }
                    }
                }
            }catch (ClassNotFoundException e){
                System.out.println("No such clas: " + e);
            }
    }
}
