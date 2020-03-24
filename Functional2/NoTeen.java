package bat.coding.java.Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(20);
        nums.add(13);
        nums.add(19);
        System.out.println(noTeen2(nums));
    }
    public static List<Integer> noTeen2(List<Integer> nums){
        nums.removeIf(n -> n > 12 && n <= 19);
        return nums;
    }

    public static List<Integer> noTeen(List<Integer> nums){
        return nums.stream()
                .filter(s -> s < 13 || s > 19)
                .collect(Collectors.toList());
    }
}

/**
 * Given a list of integers, return a list of those numbers,
 * omitting any that are between 13 and 19 inclusive.
 *
 * noTeen([12, 13, 19, 20]) → [12, 20]
 * noTeen([1, 14, 1]) → [1, 1]
 * noTeen([15]) → []
 */
