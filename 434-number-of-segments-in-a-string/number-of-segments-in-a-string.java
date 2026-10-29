//use split to find all the spaces

class Solution {
    public int countSegments(String s) {
        //find all the spaces

        //I could just like loop through and indivdually find all  the spaces

        //base case
        //if the string is empty or if there is only spaces
        if(s == null || s.trim().length() == 0){
            return 0;
        }
        
        //use a regex to match the spaces so it knows where to split
        String regex = "\\s+";
        //its better to use strip now
        String[] spliter = s.strip().split(regex);

        //count how many elements are in the array
        return spliter.length;


    }
    
}