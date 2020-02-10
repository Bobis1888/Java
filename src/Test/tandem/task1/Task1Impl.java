package Test.tandem.task1;

import java.util.*;


public class Task1Impl implements IStringRowsListSorter {

    private static final IStringRowsListSorter INSTANCE = new Task1Impl();

    @Override
    public void sort(List<String[]> rows, int columnIndex) {
        RComparator rowsComparator = new RComparator(columnIndex);
        rows.sort(rowsComparator);
    }

    public static IStringRowsListSorter getInstance(){
        return INSTANCE;
    }
}
