class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
        }
        int count = 0;
        int max = 0;
        for(int ele : set){
            if(!set.contains(ele - 1)){
                int x = ele;
                count = 1;
            
            while(set.contains(x + 1)){
                x++;
                count++;
            }
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
