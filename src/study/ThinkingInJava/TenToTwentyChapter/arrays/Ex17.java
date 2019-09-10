package study.ThinkingInJava.TenToTwentyChapter.arrays;

import study.ThinkingInJava.util.Generated;
import study.ThinkingInJava.util.Generator;

import java.math.BigDecimal;
import java.util.Arrays;

class BigGenerator implements Generator<BigDecimal>{

    @Override
    public BigDecimal next() {
        BigDecimal bigDecimal = new BigDecimal(0.2);
        return bigDecimal.add(BigDecimal.valueOf(2.2));
    }
}

public class Ex17{
    public static void main(String[] args) {
        BigDecimal[] bigDecimals = new BigDecimal[12];
        Generated.array(bigDecimals,new BigGenerator());
        System.out.println(Arrays.toString(bigDecimals));
    }
}
