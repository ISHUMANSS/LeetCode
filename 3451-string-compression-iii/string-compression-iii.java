class Solution {
    public String compressedString(String word) {
    StringBuilder comp = new StringBuilder(); // Using StringBuilder for efficient concatenation
    int i = 0;
    
    while (i < word.length()) {
        char currentChar = word.charAt(i);
        int count = 0;
        
        // Count how many times currentChar repeats, up to a maximum of 9 times
        while (i < word.length() && word.charAt(i) == currentChar && count < 9) {
            count++;
            i++;
        }
        
        // Append the count followed by the character to comp
        comp.append(count).append(currentChar);
    }
    
    return comp.toString();
}
}