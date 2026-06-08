class Solution {
    public int lengthOfLastWord(String s) {
        String []words = s.trim().split("\\s+");
        String lst = words[words.length-1];
        int l = lst.length();
        return l;
    }
}