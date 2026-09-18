class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    if(!set.contains(list)) {
                        ans.add(list);
                        set.add(list);
                    }
                    j++;
                    k--;
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
            i++;
        }
        return ans;
    }
}