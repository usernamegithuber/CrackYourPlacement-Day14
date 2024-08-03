package CrackYourPlacementDay14;

import java.util.HashMap;

public class SubarraySumsDivisiblebyK {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(solution.subarraysDivByK(nums, k)); // Expected output: 7
    }
}

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int sum = 0;
        int count = 0;
        int rem = 0;
        hs.put(0, 1); // To handle the case when the subarray starts from index 0

        for (int num : nums) {
            sum += num;
            rem = sum % k;
            if (rem < 0) {
                rem += k; // Adjust the remainder to be within the range [0, k-1]
            }
            count += hs.getOrDefault(rem, 0);
            hs.put(rem, hs.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
