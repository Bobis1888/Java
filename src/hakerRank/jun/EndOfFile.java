package hakerRank.jun;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int in = 1;
        while (scanner.hasNext()){
            String scannerString = scanner.nextLine();
            result.append(in).append(" ").append(scannerString).append("\n");
            in++;
        }
        System.out.println(result);
    }
}
