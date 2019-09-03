package Study.ThinkingInJava.TenToTwentyChapter.typeinfo.toys;

public class GenericTouTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        Object object = up.newInstance();
    }
}
