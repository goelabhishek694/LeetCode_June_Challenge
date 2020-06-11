class Solution {
    public int searchInsert(int[] nums, int target) {
        int j=0;    
        while(j<=nums.length-1){
            if(nums[j]>=target) return j;
            j++;
        }
        
        return j;
    }
    
};