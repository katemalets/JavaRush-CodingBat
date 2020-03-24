package bat.coding.java.Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Square52 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(3);
        nums.add(6);
        System.out.println(square521(nums));
    }

    public static List<Integer> square521(List<Integer> nums){
        nums.replaceAll(s -> s * s + 10);
        nums.removeIf(s -> s % 10 == 5 || s % 10 == 6);
        return nums;
    }

    public static List<Integer> square52(List<Integer> nums){
        return nums.stream()
                .map(s -> s * s + 10)
                .filter(s -> !(s % 10 == 5 || s % 10 == 6))
                .collect(Collectors.toList());
    }
}

/**
 * Given a list of integers, return a list of those numbers squared
 * and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
 *
 *
 * square56([3, 1, 4]) → [19, 11]
 * square56([1]) → [11]
 * square56([2]) → [14]
 */
