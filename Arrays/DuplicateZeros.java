/* Duplicate Zeros

Solution
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9 */

/* Algorithm

1) Iterate over the list and check if the current index element is zero or not.
2) if the current index is zero, shift all the next elements of the array by one index to the right till last index.
3) Assign the current index+1 to 0. and iterate the 2nd element after it.

*/

class Solution {
    
    public int[] addzeroIndex(int[] arr, int index){
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=0;
        return arr;
    }
    
    public void duplicateZeros(int[] arr) {
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==0){
                arr=addzeroIndex(arr,i+1);
                i=i+2;
            }
            else{
                i=i+1;
            }
        }
        
        return ;
        
    }
}
