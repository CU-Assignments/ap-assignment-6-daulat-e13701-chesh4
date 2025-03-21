class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int prev2 = 0;
        int prev1 = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + nums[i]);
            prev2 = temp;
        }
        
        return prev1;
    }
}
