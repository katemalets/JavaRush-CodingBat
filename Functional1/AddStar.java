package bat.coding.java.Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Kate");
        strings.add("Dima");
        strings.add("Max");
        System.out.println(addStar(strings));
        System.out.println(addStar2(strings));
    }

    public static List<String> addStar(List<String> strings){
        strings.replaceAll(s -> s + "*");
        return strings;
    }

    public static List<String> addStar2(List<String> strings){
        return strings.stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }

}
/**
 * Given a list of strings, return a list where each string has "*" added at its end.
 *
 *
 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 * addStar(["hello", "there"]) → ["hello*", "there*"]
 * addStar(["*"]) → ["**"]
 */
