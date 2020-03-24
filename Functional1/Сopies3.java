package bat.coding.java.Functional1;

import java.util.ArrayList;
import java.util.List;

public class Сopies3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Kate");
        strings.add("Dima");
        strings.add("Max");
        System.out.println(copies3(strings));
    }

    public static List<String> copies3(List<String> strings){
        strings.replaceAll(s -> s + s + s);
        return strings;
    }
}

/**
 Given a list of strings, return a list where each string is
 replaced by 3 copies of the string concatenated together.


 copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
 copies3(["24", "a", ""]) → ["242424", "aaa", ""]
 copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 **/