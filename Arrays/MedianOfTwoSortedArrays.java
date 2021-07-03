/* Median of Two Sorted Arrays
Hard

10945

1593

Add to List

Share
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106 */

/* Algorithm

1) Iterate through the arrays and prepare new sorted array containing elements of both the arrays.
2) calcuate the median based on the number of elements in the new array(either odd or even).

*/

/* Approach ! */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i=0;
        int j=0;
        int temp=0;
        int[] nums = new int[nums1.length+nums2.length];
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums[temp++]=nums1[i++];
                
            }
            else{
                nums[temp++]=nums2[j++];
            }
        }
        
        while(i==nums1.length && temp<nums1.length+nums2.length){
            nums[temp++]=nums2[j++];
        }
        
        while(j==nums2.length && temp<nums1.length+nums2.length){
            nums[temp++]=nums1[i++];
        }
        
        if(nums.length%2!=0){
            
            return ((double) nums[((nums.length/2)+1)-1]);
            
        }
        else{
            
             return (((double) nums[(nums.length/2)-1]+nums[(((nums.length/2)+1)-1)])/2);
        }
        
        
        
    }
}
