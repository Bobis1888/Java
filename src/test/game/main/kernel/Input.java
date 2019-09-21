package main.kernel;

import java.util.Scanner;

public class Input {
    public void input(GameKernel gameKernel){
        System.out.println("Game Palindrome3000!");
        System.out.println("Please Enter your Name: ");
        Scanner scanner = new Scanner(System.in);
        String scannerString = scanner.nextLine();
        String nameGamer = scannerString;
        gameKernel.gamerWelcome(nameGamer);
        System.out.println( "If you want exit Please Enter : 0 \n" +
                            "*** See LeaderBoard : lb \n" + "*** See all points : sp \n" +
                            "*** Change Player : cp");
        while (!scannerString.equals("0")){
            scannerString = scanner.nextLine();
            if (scannerString.equals("cp"))
                input(gameKernel);
            gameKernel.game(scannerString,nameGamer);
        }
        System.out.println("Bye.");
    }
}
