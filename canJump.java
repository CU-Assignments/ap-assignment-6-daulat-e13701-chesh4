class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false; // Can't move further
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        
        return true;
    }
}
