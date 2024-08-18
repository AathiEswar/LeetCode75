package LeetCode75.ArraysAndStrings;

public class ProductOfArrayExceptSelf {
    /* OPTIMIZED :
      Get two product array , prefix product and suffix product for each element :
          suffix :
              start from end
              save the count
              product that number to the count

          prefix :
              start from beg
              save the count
              prodcut the element to the count

      combine them by multiplying same index element of both arrays :
          iterate through both the arrays and product them
      reutrn the result
   */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;

        int[] suffixProductArray = new int[n];
        int suffixProduct = 1;

        for(int i = n-1 ; i>=0 ; i--){
            suffixProductArray[i] = suffixProduct ;
            suffixProduct *= nums[i] ;
        }
        // [24 , 12 , 4, 1]
        suffixProduct = 1;
        for(int i = 0 ; i < n ; i++){
            suffixProductArray[i] *= suffixProduct ;
            suffixProduct *= nums[i];
        }

        return suffixProductArray;
    }


    /* BRUTE FORCE :
        use two loops to iterate all possible values and get product and store in the res array
     */
    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length ;

        int [] res = new int[n];

        for(int i = 0 ; i < n ;i++){
            int product = 1 ;

            for(int j = 0 ; j < n ; j++){
                if( j != i){
                    product *= nums[j];
                }
            }

            res[i] = product;
        }

        return res;
    }
}
