class Solution {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int l = 0;
        int r = 0;
        int count = 0;

        String ans = "";

        while (r < s.length()) {

            char c = s.charAt(r);

            if (map.containsKey(c)) {

                if (map.get(c) > 0) {
                    count++;
                }

                map.put(c, map.get(c) - 1);
            }

            while (count == t.length()) {

                String curr = s.substring(l, r + 1);

                if (ans.equals("") || ans.length() > curr.length()) {
                    ans = curr;
                }

                char charr = s.charAt(l);

                if (map.containsKey(charr)) {

                    map.put(charr, map.get(charr) + 1);

                    if (map.get(charr) > 0) {
                        count--;
                    }
                }

                l++;
            }

            r++;
        }

        return ans;
    }
}