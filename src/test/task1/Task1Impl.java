package test.task1;
import java.util.ArrayList;
import java.util.List;

public class Task1Impl implements IStringRowsListSorter {
    public static final IStringRowsListSorter INSTANCE = new Task1Impl();

    @Override
    public void sort(final List<String[]> rows, final int columnIndex){
        //выход за пределы массива
        if (columnIndex>=rows.get(columnIndex).length) {
            try {
                throw new Exception("Wrong Index //" + columnIndex + "// Please Enter Correct columnIndex");
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else {
            for (String[] s : rows) {
                System.out.println(s[columnIndex]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        List<String[]> rows = new ArrayList<>();
        String[] s1 = {"1","2","3"};
        String[] s2 = {"1","2","3"};
        String[] s3 = {"1","2","3"};
        String[] s4 = {"1","2","3"};
        rows.add(s1);
        rows.add(s2);
        rows.add(s3);
        rows.add(s4);
        INSTANCE.sort(rows,3);
    }
}
