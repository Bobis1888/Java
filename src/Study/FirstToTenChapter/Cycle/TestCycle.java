package Study.FirstToTenChapter.Cycle;

public class TestCycle {
    public static void main(String[] args) {
        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
    }
}
