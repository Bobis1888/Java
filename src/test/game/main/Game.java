package main;

import main.kernel.GameKernel;
import main.kernel.Input;

public class Game {
    private Input input = new Input();
    private void goGame(){
        input.input(new GameKernel());
    }
    //запустить игру;
    public static void main(String[] args) {
        Game game = new Game();
        game.goGame();
    }
}
