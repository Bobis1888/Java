package codewars.jun;

public class Recurcive {
    public static int recocive(int x){
        if (x>10){
            x--;
        }
        System.out.println(x);
        if (x>10){
            recocive(x);
        }
        return x;
    }

    public static void main(String[] args) {
        recocive(20);
    }
}
