package project.SeaBattle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Core core = new Core();
        ArrayList<String> shipCoordinate = core.getList();
        System.out.println(shipCoordinate);
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (!shipCoordinate.isEmpty()) {
            String scannerString = scanner.nextLine().toUpperCase();
            if (shipCoordinate.contains(scannerString)){
                shipCoordinate.remove(scannerString);
                System.out.println("Hit");
                if (shipCoordinate.isEmpty()){
                    System.out.println("Sos!");
                    System.out.println("Yuo win counter: " + ++counter);
                }
            }else {
                System.out.println("Past");
            }
            counter++;
        }

    }
}
