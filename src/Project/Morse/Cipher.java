package Project.Morse;
/**@author bobis1888 */
class Cipher {
    //шифр oN
    static String[] cipher(char[] scannerChar){
       DataTable dataOnTable = new DataTable(true);
       String[] result = new String[scannerChar.length];
        for (int i = 0; i < scannerChar.length; i++) {
            result[i] = dataOnTable.getOn(scannerChar[i]);
        }
        return result;
    }
    //шифр oFF
    static char[] cipherOff(String[] string){
        DataTable morseOffTable = new DataTable(false);
        char [] words = new char[string.length];
        for (int i = 0; i < words.length ; i++) {
            words[i] = morseOffTable.getOff(string[i]);
        }
        return words;
        }
    }
