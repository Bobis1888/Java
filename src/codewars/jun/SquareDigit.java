package codewars.jun;

public class SquareDigit {
    public int squareDigits(int n){
        char[] c = String.valueOf(n).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char value : c) {
            int x = Integer.parseInt(String.valueOf(value));
            x *= x;
            sb.append(x);
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) {
        System.out.println(new SquareDigit().squareDigits(9119));
    }
}
