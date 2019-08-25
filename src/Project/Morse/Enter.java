package Project.Morse;

import static Project.Morse.Cipher.*;
import java.util.Scanner;
/**@author bobis1888 */
class Enter {
    static String[] enter() {
        System.out.println("Please Enter you Message: ");
        Scanner scanner = new Scanner(System.in);
        String scannerString = scanner.nextLine().toUpperCase();
        char[] scannerChar = scannerString.toCharArray();
        return cipher(scannerChar);
    }
}