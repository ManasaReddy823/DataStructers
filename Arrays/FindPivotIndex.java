/*

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
 

Constraints:

1 <= nums.length <= 104
-1000 <= nums[i] <= 1000

*/

/* Algorithm


1) Find the sum of all the elements in tha array by iterating trough the array.
2) start left_sum with zero and right_sum as the sum of total array.
3) subrtact the current element from the right_sum and add the previous value to the left_sum and compare them.
4) Whenever the left_sum and right_sum matches, return the index */

class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum_of_left_side_elements=0;
        int sum_of_right_side_elements=0;
        for(int i=0;i<nums.length;i++){
            sum_of_right_side_elements=sum_of_right_side_elements+nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            if(i==0){
                sum_of_right_side_elements=sum_of_right_side_elements-nums[i];
                if(sum_of_right_side_elements==sum_of_left_side_elements){
                     return 0;
                
            }
            }
            
            else{
                sum_of_left_side_elements=sum_of_left_side_elements+nums[i-1];
                if(i==nums.length-1){
                sum_of_right_side_elements=0;
                }
                else{
                    sum_of_right_side_elements=sum_of_right_side_elements-nums[i];
                }
                
                if(sum_of_right_side_elements==sum_of_left_side_elements){
                    return i;
                }
            }
        }
        return -1;
    }
  
}
  
  /* solution 2 
    
    class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum_of_left_side_elements=0;
        int sum=0
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        
        for(int i=0;i<nums.length;++i){
        if(sum_of_left_side_elements==sum-sum_of_left_side_elements-nums[i]{
              return i
        }
        sum_of_left_side_elements+=nums[i]
        }
        
        return -1;
        }
        }
    
    
    */
        


