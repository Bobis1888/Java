package project.Morse;
import java.util.Arrays;
import static project.Morse.Cipher.cipherOff;
import static project.Morse.Enter.enter;
import static project.Morse.Enter.getTestString;

/**@author bobis1888 */
public class Main {
    public static void main(String[] args) {
        String[] morse = enter(getTestString());
        System.out.println(Arrays.toString(morse));
        char[] morseOff = cipherOff(morse);
        System.out.println(morseOff);
    }
}