package hakerRank.jun;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class SearchDayInCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        GregorianCalendar calendar =
                new GregorianCalendar(Integer.parseInt(s[2]), Integer.parseInt(s[0])-1, Integer.parseInt(s[1]));
        int n = calendar.get(Calendar.DAY_OF_WEEK);
        String result = "";
        switch (n){
            case 1 : result = "SUNDAY";
                break;
            case 2 : result = "MONDAY";
                break;
            case 3 : result = "TUESDAY";
                break;
            case 4 : result = "WEDNESDAY";
                break;
            case 5 : result = "THURSDAY";
                break;
            case 6 : result = "FRIDAY";
                break;
            case 7 : result = "SATURDAY";
                break;
        }
        System.out.println(result);
    }
}
