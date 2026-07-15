class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i <= s.length() -1 ; i++){
            Character c = s.charAt(i);
            if(c == '{'){
                stack.add('}');
            } else  if(c == '['){
                stack.add(']');
            } else  if(c == '('){
                stack.add(')');
            } else {
                if(!stack.isEmpty() && c == stack.peek()){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
