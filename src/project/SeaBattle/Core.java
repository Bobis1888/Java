package project.SeaBattle;

import java.util.*;

class Core {
    private LinkedList<ArrayList<String>> ships;
    Core(){
        ships = new LinkedList<>();
        ships.add(getCoordinate());
        System.out.println("Created one Ship");
    }
    Core(int number){
        ships = new LinkedList<>();
        System.out.println("Created " + number + " Ships");
        for (int i = 0; i < number ; i++) {
            ships.add(getCoordinate());
        }
    }
    private ArrayList<String> getCoordinate(){
        List<String> listChar = Arrays.asList("A","B","C","D","E","F","G","H","J","K");
        Random random = new Random();
        int randomChar = random.nextInt(8);
        int randomInteger = random.nextInt(8);
        boolean change = random.nextBoolean();
        ArrayList<String> shipCoordinate = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            shipCoordinate.add(listChar.get(randomChar) + randomInteger);
            if (change)
                randomChar++;
            else
                randomInteger++;
        }
        return shipCoordinate;
    }
    void game(){
        System.out.println(ships);
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (!ships.isEmpty()){
            String scannerString = scanner.nextLine().toUpperCase();
            counter++;
            Iterator<ArrayList<String>> iterator = ships.iterator();
            while (iterator.hasNext()){
                if (iterator.next().contains(scannerString)){
                    iterator.next().remove(scannerString);
                    System.out.println("Hit!!!");
                    System.out.println(ships);
                }else {
                    System.out.println("LoL!!!");
                }
            }
        }
        System.out.println("You counter: " + counter);
    }
}
