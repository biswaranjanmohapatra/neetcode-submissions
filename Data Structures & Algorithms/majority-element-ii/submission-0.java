class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0) + 1);
        }
        for(int ele : map.keySet()){
            if(map.get(ele) > nums.length / 3){
                ans.add(ele);
            }
        }
        return ans;
    }
}