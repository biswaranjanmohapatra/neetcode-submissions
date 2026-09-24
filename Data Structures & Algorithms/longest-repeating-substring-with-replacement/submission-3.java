class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0;
        int r = 0;
        int maxlen = 0;
        int maxfreq = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {

            char ch = s.charAt(r);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxfreq = Math.max(maxfreq, map.get(ch));

            int len = r - l + 1;
            int change = len - maxfreq;

            if (change <= k) {
                maxlen = Math.max(maxlen, len);
            } 
            else {
                char left = s.charAt(l);
                map.put(left, map.get(left) - 1);
                l++;
            }

            r++;
        }

        return maxlen;
    }
}