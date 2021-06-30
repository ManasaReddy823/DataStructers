/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done? */

/* 
  1) Iterate over the list for the length-1 elements.
  2) Swap the elements if the current element is zero and next element is not zero, maintain the current index in a temporary variable.
  3) If the condition is not satisfied, simply go to the next element.


*/

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
      for(int i=k;i<nums.length;i++){
        nums[i]=0;
      }
    }
}
