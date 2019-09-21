package main.kernel;

import main.data.Data;

public class GameKernel implements GameKernelInterface{
    private Data data;
    public GameKernel(){
        data = new Data();
    }
    @Override
    public void gamerWelcome(String gamerName){
        if (data.searchNameGamer(gamerName)) {
            System.out.println("Hello " + gamerName + " how are you?");
            System.out.println("Your points : " + data.getPointsGamer(gamerName));
        } else {
            System.out.println("Welcome " + gamerName + " your points: 0");
            data.setPointsGamer(gamerName,0);
        }
    }
    @Override
    public int searchPalindrome(String input) {
        //слова должны быть длиннее 2 символов;
        if (input.length() < 3)
            return 0;
        //удаляем проебелы и переводим в нижний регистр для простого сравнивания;
        char[] inputArray = input.replaceAll("\\s","").toLowerCase().toCharArray();
        //определяем начало и конец строки для сравнения;
        int start = 0;
        int end = inputArray.length - 1;
        while (start<end){
            //если символ в начале строки не равен символу в конце строки return;
            if (inputArray[start]!=inputArray[end])
                return 0;
            start++;
            end--;
        }
        return inputArray.length;
    }
    @Override
    public void game(String input,String nameGamer){
        if (input.equals("sp")) {
            System.out.println("All points :" + data.getPointsGamer(nameGamer));
        }else if (input.equals("lb")){
            System.out.println("LeaderBoard :");
            data.getALeaderBoard();
        }
        int points = searchPalindrome(input);
        //если такого полиндрома небыло то начислить очки (полиндром запомнится);
        if (data.rememberPalindrome(nameGamer,input)){
            data.setPointsGamer(nameGamer,points);
            System.out.println(points);
        }else {
            System.out.println("Enter another palindrome : ");
        }
    }
}