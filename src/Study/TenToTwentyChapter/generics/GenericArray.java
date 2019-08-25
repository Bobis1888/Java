package Study.TenToTwentyChapter.generics;

public class GenericArray<T> {
    private T[] array;
    @SuppressWarnings("uncheked")
    public GenericArray(int size){
        array = (T[])new Object[size];
    }
    public void put(int index, T item){
        array[index] = item;
    }
    public T get(int index){return array[index];}
    public T[] rep(){return array;}

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        Object[] oa = gai.rep();
    }
}
