class Solution {

    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character,Integer> map = new HashMap<>();

        int n = s1.length();

        if(n > s2.length()){
            return false;
        }

        for(int i = 0; i < s1.length(); i++){

            char ch = s1.charAt(i);

            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        int r = 0;
        int l = 0;

        HashMap<Character,Integer> mape = new HashMap<>();

        while(r < s2.length()){

            char c = s2.charAt(r);

            mape.put(c,mape.getOrDefault(c,0) + 1);

            if(r - l + 1 > n){

                char left = s2.charAt(l);

                mape.put(left,mape.get(left) - 1);

                if(mape.get(left) == 0){
                    mape.remove(left);
                }

                l++;
            }

            if(r - l + 1 == n){

                if(map.equals(mape)){
                    return true;
                }
            }

            r++;
        }

        return false;
    }
}