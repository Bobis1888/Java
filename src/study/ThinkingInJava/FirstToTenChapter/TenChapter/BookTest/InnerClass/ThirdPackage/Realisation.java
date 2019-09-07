package study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.ThirdPackage;

import study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.FirstPackage.MyClass;
import study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.SecondPackage.Interface;

public class Realisation extends MyClass {
    Interface getBaseInner(){
        return this.new ProtectedMyClassInner();
    }

    public static void main(String[] args) {
        Realisation realisation = new Realisation();
        System.out.println(realisation.getBaseInner().say());
    }
}