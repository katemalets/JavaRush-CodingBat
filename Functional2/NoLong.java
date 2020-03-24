package bat.coding.java.Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("KaTze");
        strings.add("Dixma");
        strings.add("Max");
        strings.add("zxX");
        System.out.println(noLong(strings));
    }

    public static List<String> noLong(List<String> strings){
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }

    public static List<String> noLong1(List<String> strings){
        return strings.stream()
                .filter(s -> !(s.length() >= 4))
                .collect(Collectors.toList());
    }
}
/**
 * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
 *
 *
 * noLong(["this", "not", "too", "long"]) → ["not", "too"]
 * noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
 * noLong(["cccc", "cccc", "cccc"]) → []
 */
