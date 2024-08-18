package LeetCode75.ArraysAndStrings;

public class ReverseVowelsOfString {
    // create a lookup string
    // initialize two pointers i and j , where i from start and j from end
    // loop untill i<j
    // if not consonant i++ || j--
    // if both vowels swap both and move i and j
    // return the string

    public String reverseVowels(String s) {
        String lookup = "aeiouAEIOU";

        int i = 0 ;
        int j = s.length()-1;
        char[] res = s.toCharArray();

        while( i<j ){
            if(!lookup.contains(res[i] + "") ){
                i++;
            }
            else if(!lookup.contains(res[j] + "" ) ){
                j--;
            }
            else{
                char temp = res[i];
                res[i++] = res[j];
                res[j--] = temp;
            }
        }



        return new String(res);
    }
}
