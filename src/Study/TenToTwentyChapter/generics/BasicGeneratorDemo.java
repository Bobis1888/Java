package Study.TenToTwentyChapter.generics;

import Study.net.mindview.util.BasicGenerator;
import Study.net.mindview.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = new BasicGenerator<>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
