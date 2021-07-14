/*

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

*/

/* Algorithm

1) Create a new array of type boolean, size equal to the size of the given array.
2) Iterate over the given array, and if the element is present, make the elements index in boolean array to true.
3) Iterate the boolean index and return the element that has to be present in place of false.

*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        boolean[] arr  = new boolean[nums.length];
        int i=0;   
        for(i=0; i<nums.length;i++){
            arr[nums[i]-1]=true;
            
        }
        List<Integer> missing_numbers_list = new ArrayList<Integer>();
        for(i=0; i<arr.length;i++){
            if(arr[i]==false){
                missing_numbers_list.add(i+1);
            }
        }
        
        return missing_numbers_list;
        
    }
}

