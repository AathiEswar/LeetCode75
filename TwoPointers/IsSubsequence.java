package LeetCode75.TwoPointers;

public class IsSubsequence {
     /* INFERENCES :
        len of s must be less than or equal to t
        Relative order must be maintained
        We can ONLY delete elements

        what is len of s is 0 ? true ?
        wht if len of t is 0 ? false ?
        what is both len is 0 ? true ?
     */

    /*  BRUTE FORCE :
            have two pointers i and j
            Create stringbuffer for t
            loop till one of the pointers finish iterating any one of the string
                if the chars are equal then increment both pointers
                else remove teh cur element from the string buffer
            return if len(s) == pointer for s

            TC = O(n)
            SC = O(n)
     */

    /*  OPTIMIZED :
            have two pointers i and j
            loop till one of the pointers finish iterating any one of the string
                if the chars are equal then increment both pointers
                else increment the pointer of t
            return if len(s) == pointer for s

            TC = O(1)
            SC = O(n)
     */

    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n < 1){
            return true ;
        }
        if(m < 1){
            return false ;
        }
        if(m < n){
            return false ;
        }

        int i = 0 ;
        int j = 0 ;

        while( i < n && j < m ){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;

        }

        return i == n ;
    }
}
