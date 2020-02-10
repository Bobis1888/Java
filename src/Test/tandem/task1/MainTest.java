package Test.tandem.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<String[]> rows = new ArrayList<>();
        rows.add(new String[]{"1", "123"});
        rows.add(new String[]{"2", "1asd"});
        rows.add(new String[]{"4", "1"});
        rows.add(new String[]{"4", ""});
        rows.add(new String[]{"2", null});
        rows.add(new String[]{"0", "23cd"});
        rows.add(new String[]{"7", "dsa"});
        IStringRowsListSorter sorter = Task1Impl.getInstance();
        sorter.sort(rows, 1);
        for(String[] a : rows) {
            System.out.println(Arrays.asList(a));
        }
    }
}
