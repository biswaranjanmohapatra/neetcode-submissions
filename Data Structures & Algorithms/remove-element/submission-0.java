class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> set = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){
            set.add(nums[i]);
            }
        }
        for(int i = 0;i < set.size();i++){
            arr[i] = set.get(i);
        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = arr[i];
        }
        return set.size();
    }
}