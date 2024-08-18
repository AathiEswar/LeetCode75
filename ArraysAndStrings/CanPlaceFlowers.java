package LeetCode75.ArraysAndStrings;

public class CanPlaceFlowers {
    // if there is flower already then skip it
    // counter all 3 cases ,
    // if 0 in first , check if i == 0 and if the next element is also 0
    // if its in the middle then check if i-1 and i+1 is 0
    // if its last then check if i == len-1 and if the previous element is 0 too
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length ;
        int i = 0 ;

        while(i < len ){
            if(flowerbed[i] == 1){
                i+=2 ;
            }
            else{
                if( ( i == 0 || flowerbed[i-1] == 0 ) &&
                        ( i== len-1 || flowerbed[i+1] == 0 ) ) {
                    n--;
                    i++;

                }
                i++;
            }

        }

        return n < 1;
    }
}
