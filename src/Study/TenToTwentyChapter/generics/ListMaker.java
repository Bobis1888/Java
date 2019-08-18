package Study.TenToTwentyChapter.generics;

import java.util.*;

public class ListMaker<T> {
    List<T> create(){return new ArrayList<T>();}

    public static void main(String[] args) {
        ListMaker<String> listMaker = new ListMaker<>();
        List<String> list = listMaker.create();
    }
}
