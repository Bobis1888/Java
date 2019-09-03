package Study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.FirstPackage;

import Study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.SecondPackage.Interface;

public class MyClass{
    protected class ProtectedMyClassInner implements Interface{
        public ProtectedMyClassInner(){}
        public String say(){return "Hi";}
    }
}