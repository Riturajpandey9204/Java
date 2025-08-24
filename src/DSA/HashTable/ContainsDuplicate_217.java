package DSA.HashTable;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;   // duplicate found
            }
            map.put(num, 1);
        }
        return false;
    }
}
