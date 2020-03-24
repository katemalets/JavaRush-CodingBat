package bat.coding.java.Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(9);
        System.out.println(square(nums));
        System.out.println(square2(nums));
    }

    public static List<Integer> square(List<Integer> nums){
        nums.replaceAll(n -> n * n);
        return nums;
    }

    public static List<Integer> square2(List<Integer> nums){
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}

/**
 * Given a list of integers, return a list where each integer is multiplied with itself.
 *
 *
 * square([1, 2, 3]) → [1, 4, 9]
 * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
 * square([]) → []
 */
