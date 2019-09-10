package study.ThinkingInJava.TenToTwentyChapter.arrays;

import study.ThinkingInJava.util.CountingGenerator;

public class Ex13 {
    public static void main(String[] args) {
        CountingGenerator.Character cc = new CountingGenerator.Character();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10 ; i++) {
            s.append(cc.next());
        }
        System.out.println(s);
    }
}
