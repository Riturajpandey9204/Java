package DSA.HashTable;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveElementsSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int cnt = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    cnt++;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}
