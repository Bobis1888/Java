package main.kernel;

interface GameKernelInterface {
    //мнетод поиска полиндрома возращает количество очков за него если это полиндом;
    int searchPalindrome(String input);
    //регистрация нового игрока либо приветствие уже существующего;
    void gamerWelcome(String gamerName);
    //GAME;
    void game(String input,String nameGamer);
}
