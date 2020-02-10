package Test.tandem.task2;

import java.util.*;

public class MainTest {
    //заполняем лист
    public static List<IElement> test(int size) {
        List<IElement> elements = new ArrayList<>();
        for (int i = 0 ; i < size ;i++) {
            elements.add(new ElementExampleImpl(i));
        }
        Collections.shuffle(elements);
        return elements;
    }
    public static void main(String[] args) {
        List<IElement> elements = test(10);
        System.out.println(elements);
        Task2Impl task2 = Task2Impl.getInstance();
        task2.assignNumbers(elements);
        System.out.println(elements);
        System.out.println(((ElementExampleImpl) elements.get(1)).getAllOperation());
    }
}
