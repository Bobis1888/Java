package codewars.jun;

public class BeadsCounter {
    public static int countRedBeads(final int nBlue){
        int redBeads = 0;
        for (int i = 1; i < nBlue ; i++) {
            redBeads+=2;
        }
        return redBeads;
    }

    public static void main(String[] args) {
        System.out.println(countRedBeads(5));
    }
}
