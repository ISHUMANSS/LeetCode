import java.util.Hashtable;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        //if the ransomNote is longer then the mag it will not match
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        //sort both strings and loop through both to see if they match
        

        char[] ransomNoteArr = ransomNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();
        
        Arrays.sort(ransomNoteArr);
        Arrays.sort(magazineArr);

        int ransomIndex  = 0;
        int magazineIndex  = 0;

        while(true){
            //found all the needed characters
            if(ransomIndex > ransomNoteArr.length - 1) return true;

            //reach end of magazine chars
            if(magazineIndex > magazineArr.length - 1) return false;

            //get the current char
            char ransomChar = ransomNoteArr[ransomIndex];
            char magazineChar = magazineArr[magazineIndex];


            if (magazineChar > ransomChar) {
                return false;
            } else if (magazineChar == ransomChar) {
                //character was in the ransom note move both pointers
                magazineIndex++;
                ransomIndex++;
            } else {
                //character was not in the ransom note move on to the next one
                magazineIndex++;
            }


        }

        // return false;



        // //get a count of all the letters in the magazine
        // Hashtable<Character, Integer> magazineCount = new Hashtable<Character, Integer>();
        // int count = 0;
        // for(int i=0;i<magazine.length();i++){
        //     if(!magazineCount.keySet().contains(magazine.charAt(i))){
        //         magazineCount.put(magazine.charAt(i), 1);
        //     } else {
        //         count = magazineCount.get(magazine.charAt(i));
        //         magazineCount.put(magazine.charAt(i), ++count);
        //     }
        // }

        // for(char c:magazineCount.keySet()) {
        //     System.out.println("Character : "+c+" - Occurences : "+magazineCount.get(c));
        // }

        
        // //get a count of all the letters in the ransosmNote

        // Hashtable<Character, Integer> ransomCount = new Hashtable<Character, Integer>();
        // int countran = 0;
        // for(int i=0;i<ransomNote.length();i++){
        //     if(!ransomCount.keySet().contains(ransomNote.charAt(i))){
        //         ransomCount.put(ransomNote.charAt(i), 1);
        //     } else {
        //         countran = ransomCount.get(ransomNote.charAt(i));
        //         ransomCount.put(ransomNote.charAt(i), ++countran);
        //     }
        // }

        // for(char c:ransomCount.keySet()) {
        //     System.out.println("Character : "+c+" - Occurences : "+ransomCount.get(c));
        // }


        // //now that we have the counts for both of the sets compare them 



        // return false;
        
    }
}