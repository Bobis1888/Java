package main.data;

interface DataInterface {
    //есть ли такой игрок;
    boolean searchNameGamer(String name);

    //возвращает количество очков игрока;
    Integer getPointsGamer(String name);

    //изменитт очки игрока или добавить нового;
    void setPointsGamer(String name, Integer points);

    // print map с 5 лидерами;
    void getALeaderBoard();

    //запомнить полдиндром если его нету в списке полиндромов;
    boolean rememberPalindrome(String nameGamer, String palindrome);
}
