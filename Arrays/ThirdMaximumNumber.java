/*

Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Can you find an O(n) solution?

*/

class Solution {
    public int thirdMax(int[] nums) {
        Integer max=null;
        Integer second_max=null;
        Integer third_max=null;
        
        for(Integer num: nums){
            
            if(num.equals(max) || num.equals(second_max) || num.equals(third_max)){
                continue;
            }
            
            if(max == null || num > max){
                third_max=second_max;
                second_max=max;
                max=num;
            }
            else  if(second_max == null || num > second_max){
                third_max=second_max;
                second_max=num;
            }
            
            else  if(third_max == null || num > third_max){
                third_max=num;
            }
        }
        
        if(third_max == null){
            return max;
        }
        
        return third_max;
        
    }
}
