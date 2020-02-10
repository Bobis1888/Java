package Test.tandem.task2;

import java.util.*;


public class Task2Impl implements IElementNumberAssigner {
    private static final IElementNumberAssigner INSTANCE = new Task2Impl();
    @Override
    public void assignNumbers(final List<IElement> elements) {
        elements.sort(new ElementComparator());
    }
    public static Task2Impl getInstance(){
        return (Task2Impl) INSTANCE;
    }
}
