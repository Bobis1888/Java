package Rodent;

public class TestRodent {

    public static void main(String[] args) {
        RandomRodentGenerator generator = new RandomRodentGenerator();
        Rodent[] rodents = new Rodent[50];
        for (Rodent r:rodents) {
            r = generator.next();
            System.out.println(r);
        }
        generator.shared.showRefcount();
    }
}
