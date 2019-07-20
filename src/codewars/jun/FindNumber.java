package codewars.jun;

import java.util.Arrays;

public class FindNumber {
    static int stray(int[] numbers){
        Arrays.sort(numbers);
        if (numbers[0]!=numbers[1]&&numbers[0]!=numbers[2]){
            return numbers[0];
        }else {
            return numbers[numbers.length-1];
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[]{17,17,3,17,17,17};
        System.out.println(FindNumber.stray(ints));
    }
}
