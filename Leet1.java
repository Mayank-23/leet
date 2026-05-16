class Solution {
    public int romanToInt(String s) {
         HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
         roman.put('I',1);
         roman.put('V',5);
         roman.put('X',10);
         roman.put('L',50);
         roman.put('C',100);
         roman.put('D',500);
         roman.put('M',1000);
         int sum = 0, i, currentVal = 0;
         for(i=0;i<s.length();i++){
            currentVal = roman.get(s.charAt(i));
            if(i+1<s.length()&&currentVal<roman.get(s.charAt(i+1))){
                sum = sum - currentVal;
            }
            else{
                sum = sum + currentVal;
            }
         }
         return sum;
    }
}