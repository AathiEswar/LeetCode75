package LeetCode75.ArraysAndStrings;

import java.util.Arrays;

public class ReverseWordsInString {
    // have a pointer from last
    // skip the trailling spaces
    // loop backwards till i reach a space
    // append the character in forward way till white space or string end
    public String reverseWords(String s) {
        int i = s.length()-1 ;
        StringBuilder res = new StringBuilder();

        while( i >= 0){

            while(i>=0 &&  s.charAt(i) == ' '){
                i--;
            }

            while(i>=0 &&  s.charAt(i) != ' '){
                i--;
            }
            int j = i+1;
            while( j < s.length() && s.charAt(j) != ' '){
                res.append(s.charAt(j));
                j++;
            }
            res.append(" ");

        }
        return new String(res).trim();

    }


    // create a string array with split using regex of space
    // iterate half of the array and swap both ends
    // return
    public String reverseWords1(String s) {
        String[] sArray = s.trim().split("\\s+");
        System.out.println(Arrays.toString(sArray));
        int i = 0 ;
        int j = sArray.length-1;

        while( i < j ){
            String temp = sArray[i];
            sArray[i] = sArray[j];
            sArray[j] = temp;

            i++;
            j--;
        }

        return String.join(" " , sArray);
    }
}
