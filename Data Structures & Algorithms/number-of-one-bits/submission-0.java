class Solution {
    public int hammingWeight(int n) {
       String binary = Integer.toBinaryString(n);
       int count = 0;
        char[] ch = binary.toCharArray();
        for(char c : ch){
            if(c == '1'){
                count++;
            }
        }
        return count;
    }
}
