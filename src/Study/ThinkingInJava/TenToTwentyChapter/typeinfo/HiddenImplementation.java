package Study.ThinkingInJava.TenToTwentyChapter.typeinfo;

import Study.ThinkingInJava.TenToTwentyChapter.typeinfo.iterfacea.A;
import Study.ThinkingInJava.TenToTwentyChapter.typeinfo.packageaccess.HiddenC;
import java.lang.reflect.*;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        /*if (a instanceof C){
            C c = (C)a;
            c.g;
        }*/

        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");
    }
    static void callHiddenMethod(Object a,String mthodName) throws Exception{
        Method g = a.getClass().getDeclaredMethod(mthodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
