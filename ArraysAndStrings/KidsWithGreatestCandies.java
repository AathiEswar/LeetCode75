package LeetCode75.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    // get the max element frm the candies array
    // for each element add the extra candies
    // if its equal or grter than the max then it is true

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0 ;

        for(int candy : candies){
            if(candy > max){
                max = candy ;
            }
        }

        List<Boolean> res = new ArrayList<>();

        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i]+extraCandies >= max){
                res.add(true) ;
            }else{
                res.add(false);
            }
        }

        return res;
    }
}
