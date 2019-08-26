package Study.TenToTwentyChapter.generics;

class BasicHolder<T> {
    private T element;
    void set(T element){this.element = element;}
    T get(){return element;}
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
