package LeetCode75.ArraysAndStrings;

public class IncreasingTripletSubsequence {
    /* OPTIMIZE :
       loop through the array
       have two min numbers
       update min1 if a new minimum is found
       update min2 if a number greater than min1 is found
       return true if a number greater than both min1 and min2 exist
       else return false
   */
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false ;
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : nums ){
            if(num <= min1){
                min1 = num;
            }
            else if ( num <= min2){
                min2 = num;
            }
            else {
                return true ;
            }
        }
        return false ;
    }
    /*  BRUTE FORCE :
        Use three loops to find all possible combinations and return true if we find any

    */
    // public boolean increasingTriplet(int[] nums) {

    //     int n = nums.length ;

    //     if(n < 3 ){
    //         return false ;
    //     }

    //     for(int i = 0 ; i < n ; i++){
    //         for(int j = i+1 ; j < n ; j++){
    //             if(nums[i] < nums[j] ){
    //                 for(int k = j+1 ; k < n ; k++){
    //                     if(nums[j] < nums[k]){
    //                         return true ;
    //                     }
    //                 }
    //             }
    //         }
    //     }

    //     return false;
    // }
}
