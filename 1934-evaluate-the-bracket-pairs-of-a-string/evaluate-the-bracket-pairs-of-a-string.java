class Solution {
    public String evaluate(String s, List<List<String>> K) {
        //put all of the keys into a hash map for easier access
        Map<String, String> d = new HashMap<>();
        for (var k : K){
            d.put(k.get(0), k.get(1));
        }
        
        //useing a string builder as its easier to access and chanhe
        StringBuilder res = new StringBuilder();

        //find all the places to put the keys
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int j = s.indexOf(")", i + 1);
                res.append(d.getOrDefault(s.substring(i + 1, j), "?"));
                i = j;
            } else{
                res.append(s.charAt(i));
            }
        }


        //convert back to string
        return res.toString();
    }
}