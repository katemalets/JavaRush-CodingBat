package bat.coding.java.Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(-2);
        nums.add(-3);
        nums.add(-3);
        nums.add(3);
        nums.add(3);
        System.out.println(noNeg2(nums));
    }
    public static List<Integer> noNeg(List<Integer> nums){
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> noNeg2(List<Integer> nums){
        nums.removeIf(n -> n < 0);
        return nums;
    }
}
/**
 * Given a list of integers, return a list of the integers, omitting any that are less than 0.
 *
 *
 * noNeg([1, -2]) → [1]
 * noNeg([-3, -3, 3, 3]) → [3, 3]
 * noNeg([-1, -1, -1]) → []
 */
