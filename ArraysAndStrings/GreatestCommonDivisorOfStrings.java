package LeetCode75.ArraysAndStrings;

public class GreatestCommonDivisorOfStrings {
    // check if two strings are divisors by s2+s1 == s1+s2
    // use gcd to get the substring
    // return the substring divisor
    public int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        return gcd(b , a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int resLen = gcd(n , m);

        String res = str1.substring(0 , resLen );

        // for(int i = 0 ; i < n ; i++){
        //     if(str1.charAt(i) != res.charAt( i % resLen )){
        //         return "";
        //     }
        // }

        // for(int i = 0 ; i < m ; i++){
        //     if(str2.charAt(i) != res.charAt( i % resLen )){
        //         return "";
        //     }
        // }

        return res ;

    }
}
