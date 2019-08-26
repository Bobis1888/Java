package Study.TenToTwentyChapter.generics;

import java.util.ArrayList;

class FixedSizeStack<T>{
    private ArrayList<T> storage;
    public FixedSizeStack(){
        storage = new ArrayList<>();
    }
    public void push(T item){
        storage.add(item);
    }
    public int count(){
        return storage.size();
    }
    public T pop() {
        return storage.remove(storage.size()-1);
    }
}
public class GenericCast {
    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<>();
        for (String s : "A B C D E F G H I J".split(" "))
            strings.push(s);
        int s = strings.count();
        for (int i = 0; i < s  ; i++) {
            System.out.println(strings.pop());
        }
    }
}
