class Solution {
    public char processStr(String s, long k) {
        //trying to use strings would result in a string being wayyyyy to large and out of memory 
        //so rather then make the string we will first find if the character would be in the result
        //then we will need to work backwards to be able to find the character at the location

        int n = s.length();
        long len = 0;

        //get the length
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '*'){
                len = Math.max(len - 1, 0L);
            }
            else if (c == '#'){
                len *= 2;
            }
            else if (c != '%'){
                len++;
            }
        }

        //the location is not in the final string
        if (k >= len){
            return '.';
        }

        //work backwards
        for (int i = n - 1; ; i--) {
            char c = s.charAt(i);
            switch (c) {
                case '*':
                    len++;
                    break;
                case '#':
                    if (k >= len / 2)
                        k -= len / 2;
                    len /= 2;
                    break;
                case '%':
                    k = len - 1 - k;
                    break;
                default:
                    if (len == k + 1)
                        return c;
                    len--;
            }
        }



        // StringBuilder stringBuilder = new StringBuilder();

        // for(char m : s.toCharArray()){
        //     //check if its a letter
        //     if(Character.isLetter(m)){
        //         stringBuilder.append(m);
        //     }

        //     //check if its a *
        //     if(m == '*'){
        //         //check result has anything
        //         if(stringBuilder.length() != 0){
        //             stringBuilder.deleteCharAt(stringBuilder.length()-1);
        //         }
               
        //     }

        //     //check if its a #
        //     if(m == '#'){
        //         stringBuilder.append(stringBuilder);
        //     }

        //     //check if it a %
        //     if(m == '%'){
        //         stringBuilder.reverse();
        //     }
        // }

        // // System.out.println(stringBuilder.toString());

        // //check if it can return a character at the location
        // String result = stringBuilder.toString();
        // if(k >= result.length()){
        //     return '.'; 
        // }

        

        // return result.charAt((int)k); 
    }
}