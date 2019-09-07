package study.ThinkingInJava.TenToTwentyChapter.typeinfo;

import java.util.Scanner;

class Candy{
    static {
        System.out.println("Download class Candy");
    }
}
class Gum{
    static{
        System.out.println("Download class Gum");
    }
}
class Cookie{
    static {
        System.out.println("Download class Cookie");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scannerString = scanner.nextLine();

        switch (scannerString) {
            case "Candy":
                System.out.println("Your choice Candy");
                new Candy();
                break;
            case "Gum":
                System.out.println("Your choice Gum");
                new Gum();
                break;
            case "Cookie":
                System.out.println("Your choice Cookie");
                new Cookie();
                break;
        }
    }
}
