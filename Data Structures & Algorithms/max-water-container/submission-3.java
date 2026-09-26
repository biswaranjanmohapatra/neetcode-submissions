class Solution {
    public int maxArea(int[] heights) {
       int max = 0;
       int i = 0;
       int j = heights.length - 1;
       while(i < j){
        int ans = 0;
          if(heights[i] > heights[j]){
             ans = heights[j] * (j - i);
             j--;
          }
          else{
             ans = heights[i] * (j - i);
             i++;
          }
          max = Math.max(ans , max);
       }
       return max; 
    }

}
