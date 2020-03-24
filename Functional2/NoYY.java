package bat.coding.java.Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Kaze");
        strings.add("Diуxmy");
        strings.add("ya");
        strings.add("yyy");
        System.out.println(noLong1(strings));
    }

    public static List<String> noLong(List<String> strings){
        strings.removeIf(s ->s.endsWith("y"));
        strings.replaceAll(s -> s + "y");
        return strings;
    }

    public static List<String> noLong1(List<String> strings){
        return strings.stream()
                .filter(s ->!s.endsWith("y"))
                .map(s -> s + "y")
                .collect(Collectors.toList());
    }
}

/**
 * Given a list of strings, return a list where each string has
 * "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
 *
 *
 * noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
 * noYY(["a", "b", "cy"]) → ["ay", "by"]
 * noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */
