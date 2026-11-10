import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        //keep track of an array of scores recorded
        //useing an array list to make it easier to keep the record

        ArrayList<Integer> score = new ArrayList<>();

        for(String s : operations){
            //need to figure out what the operation is
            if(s.equals("C")){
                //remove previous score
                score.remove(score.size()-1);

            }
            else if(s.equals("D")){
                //double previous score
                score.add(score.get(score.size()-1) * 2);
            }
            else if(s.equals("+")){
                //add the sum of the last two scores
                score.add(score.get(score.size()-1) + score.get(score.size()-2));

            }
            else{
                //add the new score
                score.add(Integer.parseInt(s));
            }
        }

        int result=0;
        for(int n:score){
            result+=n;
        }
        return result;
    }
}

