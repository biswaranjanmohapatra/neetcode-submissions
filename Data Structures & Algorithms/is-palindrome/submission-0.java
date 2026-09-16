class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder ans = new StringBuilder(
            s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
        );

        int i = 0;
        int j = ans.length() - 1;

        while (i < j) {

            if (ans.charAt(i) != ans.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}