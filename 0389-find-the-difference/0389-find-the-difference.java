class Solution {
    public char findTheDifference(String s, String t) {
        int sumOfS=0,sumOfT=0;
        for(int i=0;i<s.length();i++){
            sumOfS= sumOfS + (int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            sumOfT=sumOfT + (int)t.charAt(i);
        }
        int diff = sumOfT-sumOfS;
        return (char) diff;
    }
}