package Study.ThinkingInJava.TenToTwentyChapter.strings;

import java.util.Scanner;

public class Ex20 {
    int i;
    float f;
    double d;
    long l;
    String s;
    Ex20(String s1){
        Scanner scanner = new Scanner(System.in);
        String[] strings = s1.split(" ");
        for (String str:strings) {
        }

        i = scanner.nextInt();
        f = scanner.nextFloat();
        d = scanner.nextDouble();
        l = scanner.nextLong();
        s = scanner.nextLine();
    }
    public String toString(){
        return i + " " + f + " " + d + " " + l + " " + s;
    }

    public static void main(String[] args) {
        Ex20 ex20 = new Ex20("1 2.22 2.333333333 111111111111111111111 SASDSAD");
        System.out.println(ex20);
    }
    }

