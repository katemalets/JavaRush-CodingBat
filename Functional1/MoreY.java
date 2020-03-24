package bat.coding.java.Functional1;

import java.util.ArrayList;
import java.util.List;

public class MoreY {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Kate");
        strings.add("Dima");
        strings.add("Max");
        System.out.println(moreY(strings));
    }

    public static List<String> moreY(List<String> strings){
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}

/**
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 *
 *
 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
 * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
 * moreY(["yay"]) → ["yyayy"]
 */
