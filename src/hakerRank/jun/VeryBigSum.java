package hakerRank.jun;

public class VeryBigSum {
    static long aVeryBigSum(long [] ar){
        long result = 0L;
        for (long l:ar) {
            result+=l;
        }
        return result;
    }
    public static void main(String[] args) {
        Long result = 5000000015L;
        long[] longs = new long[5];
        longs[0] = 1000000001L;
        longs[1] = 1000000002L;
        longs[2] = 1000000003L;
        longs[3] = 1000000004L;
        longs[4] = 1000000005L;
        System.out.println(result.equals(aVeryBigSum(longs)));
    }
}
