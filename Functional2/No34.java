package bat.coding.java.Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Kaze");
        strings.add("Diуxma");
        strings.add("Max");
        strings.add("zX");
        System.out.println(noLong(strings));
    }

    public static List<String> noLong(List<String> strings){
        strings.removeIf(s -> s.length() == 4 || s.length() == 3);
        return strings;
    }

    public static List<String> noLong1(List<String> strings){
        return strings.stream()
                .filter(s -> !((s.length() == 3) || (s.length() == 4)))
                .collect(Collectors.toList());
    }
}

/**
 Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

 no34(["a", "bb", "ccc"]) → ["a", "bb"]
 no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
 no34(["ccc", "dddd", "apple"]) → ["apple"]
 **/