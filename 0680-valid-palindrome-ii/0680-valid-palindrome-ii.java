// https://www.youtube.com/watch?v=wX3-411uJH0

class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int low, int high){
            while(low<high){
                if(s.charAt(low)==s.charAt(high)){
                    low++;
                    high--;
                }
                else{
                    return false;
                }
            }
            return true;
        }
}