package LeetCode75.ArraysAndStrings;

public class MergeStringsAlternately {
    public String mergeAlternatelyOPTIMIZED(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        StringBuilder res = new StringBuilder();
        int i  = 0;
        int j = 0;

        while( i < n || j < m){
            if(n > i){
                res.append(word1.charAt(i));
                i++;
            }

            if(m > j){
                res.append(word2.charAt(j));
                j++;
            }

        }


        return res.toString();
    }
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        if(n==1){
            return word1 + word2;
        }

        int i  = 0;
        StringBuilder res = new StringBuilder();
        for(i = 0 ; i< Math.max(n , m) ; i++){
            if(n > i){
                res.append(word1.charAt(i));
            }

            if(m > i){
                res.append(word2.charAt(i));
            }

        }


        return res.toString();
    }
}
