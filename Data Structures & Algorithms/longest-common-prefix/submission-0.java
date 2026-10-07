class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] arr1 = strs[0].toCharArray();
        char[] arr2 = strs[strs.length - 1].toCharArray();
        String ans = "";
        for(int i = 0;i < arr1.length;i++){
            if(arr1[i] == arr2[i]){
                ans += arr1[i];
            }else{
                break;
            }
        }
        return ans;
    }
}