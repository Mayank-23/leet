class Solution {
    public boolean isValid(String s) {
      Stack<Character> in = new Stack<>();
      int i;
      for(i=0;i<s.length();i++){
        if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
            in.push(s.charAt(i));
        }
        else if(in.isEmpty()){
            return false;
        }
        if(s.charAt(i)==']'&&in.pop()!='['){
            return false;
        }
        if(s.charAt(i)=='}'&&in.pop()!='{'){
            return false;
        }
        if(s.charAt(i)==')'&&in.pop()!='('){
            return false;
        }
      }
      return in.isEmpty();
 }
}