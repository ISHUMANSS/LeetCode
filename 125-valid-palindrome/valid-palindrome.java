class Solution {
    public boolean isPalindrome(String s) {
        
        Stack checkerStack = new Stack();
        Queue checkerQueue = new LinkedList<String>();
        String stackResult = "";
        String queueResult = "";

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                checkerQueue.add(s.charAt(i));
                checkerStack.push(s.charAt(i));
            }
            
        }

        while(checkerStack.isEmpty() == false){
            stackResult = stackResult + checkerStack.pop();
        }

        while(checkerQueue.isEmpty() == false){
            queueResult = queueResult + checkerQueue.poll();
        }

        if(stackResult.equalsIgnoreCase(queueResult)){
            return true;
        }





        return false;
    }
}