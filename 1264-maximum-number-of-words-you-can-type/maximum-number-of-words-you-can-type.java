import java.util.HashSet;
import java.util.Set;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        //split up the strings into sub strings at each " "
        //check if that word contains the broken letters

        String[] parts = text.split(" ");

        //no broken characters
        if (brokenLetters.isEmpty()) {
            return parts.length;
        }

        //store broken letters in a set for quick lookup
        Set<Character> brokenSet = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }
        
        //count
        int count = 0;

        //check if the words are typeable
        for (String part : parts) {
            boolean canType = true;
            for (char c : part.toCharArray()) {
                if (brokenSet.contains(c)) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }

        }

        return count;
        
    }
}