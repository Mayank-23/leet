class Solution {
    public boolean isPalindrome(int x) {
        int i,j,orig=x,rev=0;
        while(orig!=0){
            i=orig%10;
            rev = rev * 10 + i;
            orig=orig/10;
        }
        if(rev==x && x>=0){
            return true;
        }
        else{
            return false;
        }
    }
}