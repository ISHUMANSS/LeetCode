class Solution {
    public boolean canAliceWin(int n) {
        //can just brute force it cause it starts at 10 stones and go down
        //like a series of if statements
        int count = 10;

        boolean isTurn = true;

        while(n >= count){
            System.out.println(n - count);
            n -= count;
            
            count --;

            isTurn = !isTurn;
        }


        return !isTurn;
    }
}