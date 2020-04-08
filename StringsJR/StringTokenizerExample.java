package bat.coding.java.StringsJR;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("query cat dog"," ");
        String token;
        while (stringTokenizer.hasMoreTokens()){
            token = stringTokenizer.nextToken();
            System.out.println(token);
        }
    }
}

/**
 1. StringTokenizer

 Используя StringTokenizer разделить query на части по разделителю delimiter.

 Пример:
 getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
 **/