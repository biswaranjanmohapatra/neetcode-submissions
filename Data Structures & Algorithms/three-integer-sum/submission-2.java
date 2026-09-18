class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> check = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int answer = -1 * (nums[i] + nums[j]);
                if (set.contains(answer)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(answer);
                    Collections.sort(list);
                    if (!check.contains(list)) {
                        ans.add(list);
                        check.add(list);
                    }
                }
                set.add(nums[j]);
            }
        }

        return ans;
    }
}