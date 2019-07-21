package Study.TenToTwentyChapter.strings;

import java.math.*;
import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        char u = 'a';
        System.out.println("u = 'a'");
        f.format("%-2s%-2S%-2c%-2C%-5b%-5B%-3h%-3H%%\n", u,u,u,u,u,u,u,u);
        int v = 121;
        System.out.println("v =121");
        f.format("%-2d%-2c%-2C%-5b%-5B%-2s%-2S%-2x%-2X%-3h%-3H%%\n",v,v,v,v,v,v,v,v,v,v,v);

        BigInteger w = new BigInteger("50000000000000");
        System.out.println("w = new BigInteger(\"50000000000000\")");
        f.format("d: %d\n",w);
        f.format("b: %b\n",w);
        f.format("s: %s\n",w);
        f.format("x: %x\n",w);
        f.format("h: %h\n",w);

        double x = 179.543;
        System.out.println("x = 179.543");
        f.format("b: %b\n",x);
        f.format("s: %s\n",x);
        f.format("f: %f\n",x);
        f.format("e: %e\n",x);
        f.format("h: %h\n",x);

        Conversion y = new Conversion();
        System.out.println("y = new Conversion()");
        f.format("b: %b\n",y);
        f.format("s: %s\n",y);
        f.format("h: %h\n",y);

        boolean z = false;
        System.out.println("z = false");
        f.format("b: %b\n",z);
        f.format("s: %s\n",z);
        f.format("h: %h\n",z);
    }
}
