class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            System.out.println(stack);
            if(c == '{'){
                stack.add('}');
            } else if(c =='['){
                stack.add(']');
            } else if(c == '('){
                stack.add(')');
            } else {
                if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            } else {
                return false;
            }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
