class Solution {
    public void moveZeroes(int[] nums) {
        int nonindx = 0;
        for(int i=0; i< nums.length;i++){
            if(nums[i] !=0){
                nums[nonindx] = nums[i];
                nonindx++;
            }
        }

        for(int i = nonindx; i < nums.length; i++){
            nums[i] = 0;
        }

        
    }
}