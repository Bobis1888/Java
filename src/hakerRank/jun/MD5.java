package hakerRank.jun;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        MessageDigest messageDigest = null;
        byte[] digest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            digest = messageDigest.digest();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        StringBuilder hex = new StringBuilder(new BigInteger(1,digest).toString(16));
        while (hex.length() < 32){
            hex.insert(0, "0");
        }
        System.out.println(hex);
    }
}
