class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int t = word2.length();
        int i = 0;
        int j = 0;
        while(n > 0 && t > 0){
            char c = word1.charAt(i);
            char ch = word2.charAt(j);
            sb.append(c);
            sb.append(ch);
            i++;
            j++;
            n--;
            t--;
        }
        while(i < word1.length()){
            char c = word1.charAt(i);
            sb.append(c);
            i++;
        }
        while(j < word2.length()){
            char c = word2.charAt(j);
            sb.append(c);
            j++;
        }
        String s = sb.toString();
        return s;
    }
}