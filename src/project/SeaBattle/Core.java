package project.SeaBattle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Core {
    public ArrayList<String> getList(){
        List<String> listChar = Arrays.asList("A","B","C","D","E","F","G","H","J","K");
        Random random = new Random();
        int randomChar = random.nextInt(8);
        int randomInteger = random.nextInt(8);
        ArrayList<String> shipCoordinate = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            shipCoordinate.add(listChar.get(randomChar) + randomInteger);
            randomChar++;
            randomInteger++;
        }
        return shipCoordinate;
    }
}
