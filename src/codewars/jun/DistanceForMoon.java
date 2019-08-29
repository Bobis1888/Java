package codewars.jun;

public class DistanceForMoon {
    public static long fold(Double distance){
        if (distance<0)
            return Long.parseLong(null);
        double paperM = 0.0001d;
        long quantity = 0;
        while (paperM < distance){
            paperM*=2;
            quantity++;
        }
        return quantity;
    }

    public static void main(String[] args) {
        System.out.println(fold(new Double(384000000)));
    }
}
