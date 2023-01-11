/*
    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

    Example 1:
    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
    Example 2:

    Input: height = [4,2,0,3,2,5]
    Output: 9
 */
class trappingWater {
    class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //cal left max 
        int leftmax [] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        
        //rigth max 
        int rigthmax [] = new int[n];
        rigthmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rigthmax[i] = Math.max(height[i], rigthmax[i+1]);
        }
        
        int trappedwater = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rigthmax[i]);
            trappedwater += waterlevel -height[i];
        }
            return trappedwater;
    }
}
    public static void main(String[] args) {
       int [] height = {4,2,0,3,2,5};
    }
}