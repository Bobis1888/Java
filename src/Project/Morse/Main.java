package Project.Morse;
import java.util.Arrays;
import static Project.Morse.Cipher.cipherOff;
import static Project.Morse.Enter.enter;
/**@author bobis1888 */
public class Main {
    public static void main(String[] args) {
        String [] string = enter();
        System.out.println(Arrays.toString(string));
        System.out.println(cipherOff(string));
    }
}