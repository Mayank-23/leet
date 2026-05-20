class Solution {
    public boolean canReach(int[] arr, int start) {
        int i=-0,len=arr.length;
        while(i<len){
            if(arr[start]==0){
                return true;
            }
            else if(start + arr[start]>=len){
                start = Math.abs(start-arr[start]);
                i++;
            }
            else{
                start = start + arr[start];
                i++;
            }
            if(i==len){
                return false;
            }
            
        }
        throw new IllegalArgumentException("false");  
    }
    
}