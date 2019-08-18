package codewars.jun;

public class Arge {
    private static int i = 1;
    public static int nbYear(int p0, double percent, int aug, int p) {
        int sum = (int) (p0 + (p0*percent)/100 + aug);
        if (sum < p) {
            i++;
            return nbYear(sum, percent, aug, p);
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
    }
}
