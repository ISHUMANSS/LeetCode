import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        //stack
        //add to stack every open bracket
        //when a close happens pop the top of the stack
        Stack<Character> sta = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            //put the starter character
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                sta.push(s.charAt(i));
            }
            // s.push(s.charAt(i));
            //if its a closing check the stack
            if(s.charAt(i) == ')'){
                if(sta.isEmpty()){
                    return false;
                }
                if(sta.peek() != '('){
                    return false;
                }
                sta.pop();                
            }
            else if(s.charAt(i) == ']'){
                if(sta.isEmpty()){
                    return false;
                }
                if(sta.peek() != '['){
                    return false;
                }
                sta.pop();  
            }
            else if(s.charAt(i) == '}'){
                if(sta.isEmpty()){
                    return false;
                }
                if(sta.peek() != '{'){
                    return false;
                }
                sta.pop();  
            }

            

        }
        //check if the stack is empty
        return sta.isEmpty();
    }
}