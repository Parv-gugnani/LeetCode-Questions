class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length - 1;
        int maxarea = 0;

        while(left < right){
            int width = right - left;
            int minhi = Math.min(height[left], height[right]);
            int curr = width * minhi;

            maxarea = Math.max(maxarea, curr);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}