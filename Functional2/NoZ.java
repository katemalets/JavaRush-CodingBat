package bat.coding.java.Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("KaTze");
        strings.add("Dixma");
        strings.add("Max");
        strings.add("zxX");
        System.out.println(noZ1(strings));
    }

    public static List<String> noZ(List<String> strings){
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

    public static List<String> noZ1(List<String> strings){
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }
}

/**
 * Given a list of strings, return a list of the strings,
 * omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
 *
 *
 * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
 * noZ(["hziz", "hzello", "hi"]) → ["hi"]
 * noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */
