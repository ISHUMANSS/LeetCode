class Solution {
    public String processStr(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for(char m : s.toCharArray()){
            //check if its a letter
            if(Character.isLetter(m)){
                stringBuilder.append(m);
            }

            //check if its a *
            if(m == '*'){
                //check result has anything
                if(stringBuilder.length() != 0){
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
               
            }

            //check if its a #
            if(m == '#'){
                stringBuilder.append(stringBuilder);
            }

            //check if it a %
            if(m == '%'){
                stringBuilder.reverse();
            }
        }

        System.out.println(stringBuilder.toString());

        

        return stringBuilder.toString();        
    }
}