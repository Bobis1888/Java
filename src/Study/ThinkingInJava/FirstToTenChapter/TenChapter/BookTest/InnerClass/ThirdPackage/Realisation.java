package Study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.ThirdPackage;

import Study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.FirstPackage.MyClass;
import Study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.SecondPackage.Interface;

public class Realisation extends MyClass {
    Interface getBaseInner(){
        return this.new ProtectedMyClassInner();
    }

    public static void main(String[] args) {
        Realisation realisation = new Realisation();
        System.out.println(realisation.getBaseInner().say());
    }
}