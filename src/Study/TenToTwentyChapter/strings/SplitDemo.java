package Study.TenToTwentyChapter.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        ArrayList arrayList = new ArrayList<>(Arrays.asList(input.split("!!")));
            System.out.println(arrayList);

    }
}
