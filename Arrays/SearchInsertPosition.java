/*

Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104 */

/* Algorithm */

class Solution {
    
    int return_index(int[] nums, int start_index, int last_index, int target){
        
      
        if(last_index>=start_index){
            int middle_index=start_index+(last_index-start_index)/2;
        
        
        if(nums[middle_index]==target){
                return middle_index;

        }
            
        if(nums[middle_index]>target){
            
            return return_index(nums,start_index,middle_index-1,target);
                
        }
        else{
            return return_index(nums,middle_index+1,last_index,target);
        }
           
            
            
        }
        
        return last_index+1; 
        
     }
    
    
    
    public int searchInsert(int[] nums, int target) {

        
        return return_index(nums,0,nums.length-1,target);
        
        
    }
}
