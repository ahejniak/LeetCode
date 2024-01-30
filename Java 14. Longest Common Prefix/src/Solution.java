class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder finalString = new StringBuilder();
        String character = "";
        for (int i = 0; i < strs[0].length(); i++) {
            character = String.valueOf(strs[0].charAt(i));
            if (strs.length==1){
                finalString.append(character);
                return finalString.toString();
            }
            for (int y=1;y<strs.length;y++){
                if (finalString.length()==strs[y].length()) {
                    return finalString.toString();
                }
                if (!character.equals(String.valueOf(strs[y].charAt(i)))){
                    return finalString.toString();
                } else if (y == strs.length-1) {
                    finalString.append(character);
                }
            }
        }
        return finalString.toString();
    }
}