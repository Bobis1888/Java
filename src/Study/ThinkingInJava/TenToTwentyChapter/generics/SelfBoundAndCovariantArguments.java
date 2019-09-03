package Study.ThinkingInJava.TenToTwentyChapter.generics;

interface SelfBoundSetter<T extends SelfBoundSetter<T>>{
    void set(T arg);
}
interface Setter extends SelfBoundSetter<Setter>{}
public class SelfBoundAndCovariantArguments {
    void testA(Setter s1,Setter s2,SelfBoundSetter sbs){
        s1.set(s2);
    }
}
