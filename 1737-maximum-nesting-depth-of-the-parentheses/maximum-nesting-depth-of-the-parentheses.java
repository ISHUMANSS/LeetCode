class Solution {
    public int maxDepth(String s) {
        //keep 2 counts 
        //one count counting the open number
        //one count counting the closed number

        //if the open 
        int open = 0;
        int closed = 0;
        for(int i = 0; i < s.length(); i++){
            //count the open number
            if(s.charAt(i) ==('(')){
                open ++;
            }
            //count the closed
            else if(s.charAt(i) ==(')')){
                open --;
            }


            //if x is higher then why the nested is 
            if (open > closed){ 
                closed = open;
            }

        }

        return closed;

    }
}