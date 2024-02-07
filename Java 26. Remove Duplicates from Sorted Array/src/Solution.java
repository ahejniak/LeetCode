import java.util.ArrayList;

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int temp=0;
        for (int i=0;i<nums.length;i++){
            if (!newArray.contains(nums[i])){
                newArray.add(i);
                temp++;
            }
        }
        return newArray.size();
    }
}