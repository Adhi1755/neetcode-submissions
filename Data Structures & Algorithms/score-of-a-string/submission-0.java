class Solution {
    public int scoreOfString(String s) {
        int output = 0;
        for(int i=1;i<s.length();i++){
            output += Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return output;
    }
}