class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i < strs.length;i++){
            String ans = strs[i];
            char[] arr = ans.toCharArray();
            Arrays.sort(arr);
            String anss = new String(arr);
            if(!map.containsKey(anss)){
                map.put(anss,new ArrayList<>());
            }
            map.get(anss).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
