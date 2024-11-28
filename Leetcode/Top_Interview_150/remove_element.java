// https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150


class Solution {
    public int removeElement(int[] nums, int val) {
        int m =0;
        for(int j = 0 ;j < nums.length ; j++){
            if(nums[j]!=val){
                nums[m]=nums[j];
                m++;               
            }           
        }
        return m;        
    }
}
