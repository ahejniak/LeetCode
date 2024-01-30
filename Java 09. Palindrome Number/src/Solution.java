
import java.util.ArrayList;
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        } else {
            String xString = Integer.toString(x);

            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i=0; i<xString.length(); i++){
                int number = Character.getNumericValue(xString.charAt(i));
                numberList.add(number);
            }

            ArrayList<Integer> numberPalindrome = new ArrayList<>();
            for (int i=numberList.size(); i>0; i--) {
                int number = numberList.get(i - 1);
                numberPalindrome.add(number);
            }
            if (numberList.equals(numberPalindrome)){
                return true;
            }
        }
        return false;
    }
}