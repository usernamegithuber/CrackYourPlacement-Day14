package CrackYourPlacementDay14;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxind) {
                return false;
            }
            maxind = Math.max(maxind, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame solution = new JumpGame();
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};

        System.out.println(solution.canJump(nums1)); // Output: true
        System.out.println(solution.canJump(nums2)); // Output: false
    }
}
