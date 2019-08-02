package Study.TenToTwentyChapter.typeinfo.packageaccess;

import Study.TenToTwentyChapter.typeinfo.Ex25;

import java.lang.reflect.Field;

public class Ex25Method {

    public static void main(String[] args) throws Exception {

            Ex25 ex25 = new Ex25();
            Field field = ex25.getClass().getDeclaredField("i2");
            field.setAccessible(true);
        System.out.println(field.getInt(ex25));

        field.setInt(ex25,25);
        System.out.println(field.getInt(ex25));
    }
}
