package hakerRank.jun;

import java.util.Scanner;

public class LoopsII {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            StringBuilder result = new StringBuilder();
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = 1;
            for (int j = 1; j <= n; j++) {
                a +=c * b;
                result.append(a).append(" ");
                c*=2;
            }
            System.out.println(result);
        }
        in.close();
    }
}
