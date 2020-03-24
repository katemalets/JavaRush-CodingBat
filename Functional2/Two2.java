package bat.coding.java.Functional2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(6);
        System.out.println(two(nums));
    }

    public static List<Integer> two2(List<Integer> nums){
        nums.replaceAll(s -> s * 2);
        nums.removeIf(s -> s % 10 == 2);
        return nums;
    }

    public static List<Integer> two(List<Integer> nums){
        return nums.stream()
                .map(s -> s * 2)
                .filter(s -> s % 10 != 2)
                .collect(Collectors.toList());
    }
}
/**
 * Given a list of non-negative integers, return a list of those
 * numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
 *
 *
 * two2([1, 2, 3]) → [4, 6]
 * two2([2, 6, 11]) → [4]
 * two2([0]) → [0]
 */
