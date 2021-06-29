/* Given a binary array nums, return the maximum number of consecutive 1's in the array.

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1. */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        for(int i: nums){
            if(i==1){
                count++;
            }
            else{
                maxcount=Math.max(count,maxcount);
                count=0;
            }
            
           /* if(mainsum<count){
                mainsum=count;
                
            }*/
        }
        maxcount=Math.max(count,maxcount);
        return maxcount;
    }
}
