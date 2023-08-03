import java.util.Arrays;
/**
 * Day 2 of 30
   Challenge: Given a sorted array arr[], and a number x, 
   write a function that counts the occurrences of x in arr[].
   
   This function uses Binary search to do the job.
 *
 * @author Hemang Jain
 * @version 02/08/2023
 */
public class Occurence {
    static void bs_O()
    {
        int []arr = {1,2,3,4,5,6,7,8,9,9,9,9,9,9,10};
        int x = 9;
        int f = 0, r = arr.length - 1;
        int c = 0;
        
        while (f <= r) {
            int m = (f + r) / 2;
            if (arr[m] == x) {
                c ++;
                f = m-1; r = m+1;
                while(arr[f]==x) {
                    c++; f--;
                }
                while(arr[r]==x) {
                    c++; r++;
                }
                break;
            }
            else if (arr[m] < x)
                f = m + 1;
            else
                r = m - 1;
        }
        System.out.println(c);
    }
}