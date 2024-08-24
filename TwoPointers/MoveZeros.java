package LeetCode75.TwoPointers;

public class MoveZeros {
    class Solution {
    /*  INFERENCES :
            Both positive and negative numebers exist
            result numbers must be in realative order
            len of array can be 1 but not null

        BRUTE FORCE :
            Create an empty array of same size
            add elements to the array only if its not 0
            copy back the array to res array
     */
    /* public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];

        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                arr[j++] = nums[i];
            }
        }
        j = 0 ;
        for(int num : arr){
            nums[j++] = num ;
        }
    } */


        //  public void moveZeroes(int[] nums) {
        //     // OPTIMIZED :
        //     //  Use Hookers two pointer algorithm
        //     //   initialize a hooker index = 0
        //     int hooker = 0 ;
        //     //   loop through the array
        //     for(int i = 0 ; i < nums.length ; i++){
        //         // when a non zero numebr is encountered
        //         if(nums[i] != 0){
        //             // swap with hooker index and increment hooker index
        //             int temp = nums[i];
        //             nums[i] = nums[hooker];
        //             nums[hooker] = temp ;
        //             hooker++;
        //         }
        //     }
        //  }

    /* MOST OPTIMIZED :
        Use hooker algorithm but no swaps

        when encounter a non zero , change the zero to num

        after loop ends , make the nums as zero from the last hooker index
     */

        public void moveZeroes(int[] nums) {
            int hooker = 0  ;
            for(int num : nums ){
                if( num != 0 ){
                    nums[hooker++] = num ;
                }
            }

            while( hooker < nums.length ){
                nums[hooker++] = 0;
            }
        }
    }
}
