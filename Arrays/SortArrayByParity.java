/*

Sort Array By Parity

Given an array nums of non-negative integers, return an array consisting of all the even elements of nums, followed by all the odd elements of nums.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 

Note:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000

*/

/*
1) Iterate the elements over the entire list.
2) if an even number is found swap the even number with the last found odd number index.
3) Store the last found odd number index.
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int k=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                temp=nums[k];
                nums[k++]=nums[i];
                nums[i]=temp;
            }
        }
        
        return nums;
    }
}
