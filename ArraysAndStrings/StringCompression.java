package LeetCode75.ArraysAndStrings;

public class StringCompression {
    /* OPTIMIZED :
     have a hooker index = 0
     loop through the array
         get the char and count = 0
         loop again till the char is same :
             increment count
         add the char and the count to the chars array
     return hooker index

 */
    public int compress(char[] chars) {
        int i = 0 ;
        int j = 0 ;

        while( j < chars.length){
            char chr = chars[j];
            int count = 0 ;

            while( j < chars.length && chars[j] == chr){
                j++;
                count++;
            }

            chars[i++] = chr;

            if(count != 1){
                for(char num : Integer.toString(count).toCharArray()){
                    chars[i] = num;
                    i++;
                }

            }
        }
        return i;
    }
    /* BRUTE FORCE :
        Create a queue with int[] as elements
        use two vars char and count
        store first char and count = 1

        loop through chars from 1:
            if char == chars[i]:
                count++
            else :
                add the count and char to queue
                change char to cur char
                count = 1

        after the loop ends the last element wont be added to the queue so do it

        add all the elements from queue to chars
        if count == 1 the only add the char
        if not then add both count and char to the chars array

     */
    // public int compress(char[] chars) {
    //     Queue<char[]> queue = new LinkedList<>();
    //     char chr = chars[0];
    //     int count = 1 ;

    //     for(int i = 1 ; i < chars.length ; i++){
    //         if( chars[i] == chr){
    //             count++;
    //         }
    //         else{
    //             queue.offer(new char[]{ chr ,  (char)(count + '0') });
    //             count = 1;
    //             chr = chars[i];
    //         }
    //     }
    //     queue.offer(new char[]{ chr , (char)(count + '0' ) });
    //     while(!queue.isEmpty()){
    //         System.out.println(queue.poll());
    //     }

    //     return 0;
    // }
}
