package bat.coding.java.Functional1;

import java.util.ArrayList;
import java.util.List;

public class NoX {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("KaTe");
        strings.add("Dixma");
        strings.add("Max");
        strings.add("xX");
        System.out.println(noX(strings));
    }

    public static List<String> noX(List<String> strings){
        strings.replaceAll(s -> s.replaceAll("x",""));
        return strings;
    }
}
/**
 * Given a list of strings, return a list where each string has all its "x" removed.

 *
 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 * noX(["x"]) → [""]
 */
