package codewars.jun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public static boolean validatePin(String pin) {
        if (pin.length()==4||pin.length()==6){
            Matcher pattern = Pattern.compile("\\D").matcher(pin);
            return !pattern.find();
        } else {
            return false;
        }
    }
}
public class ValidatePinCode {
    public static void main(String[] args) {
        System.out.println(Solution.validatePin("555555"));
        System.out.println(Solution.validatePin("555"));
        System.out.println(Solution.validatePin("5555555"));


    }
}
