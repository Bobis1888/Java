package Study.FirstToTenChapter.Rodent;

public class TestRodent {

    public static void main(String[] args) {
        RandomRodent generator = new RandomRodent();
        Rodent[] rodents = new Rodent[50];
        for (Rodent r:rodents) {
            r = generator.next();

        }

    }
}
