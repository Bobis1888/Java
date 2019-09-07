package study.ThinkingInJava.TenToTwentyChapter.strings;

import java.util.*;
import java.util.regex.*;

public class Groups {
    static public final String POEM = "Twas brillig, and the slithy toves \n" +
                                      "Did gyre and gimble in the wabe.\n" +
                                      "All mimsy were the borogoves,\n" +
                                      "And the mome raths outgrabe.\n\n" +
                                      "Beware the Jabberwock, mu son,\n" +
                                      "The jaws that bite, the claws that catch.\n" +
                                      "Beware the Jubjub bird, and shun\n" +
                                      "The Frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);
        Set<String>word = new TreeSet<>();
        while (m.find()){
            word.add(m.group());
            }
        System.out.println("Number of unique non-cap words = " + word.size());
            System.out.println(word);
        }
    }
