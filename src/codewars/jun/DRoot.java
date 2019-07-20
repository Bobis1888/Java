package codewars.jun;

public class DRoot {
    public static int digital_root(int n){
        int sum = 0;
        if (n/10 != 0 ){
            while (n%10 !=0 ){
                sum += n%10;
                n/=10;
            }
        }
        if (sum/10 == 0){
            return  sum;
        }
        return digital_root(sum);
    }

    public static void main(String[] args) {
        System.out.println(digital_root(456));
    }
}
