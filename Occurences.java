import java.util.Arrays;
/**
 * Day 2 of 30
   Challenge: Given a sorted array arr[], and a number x, 
   write a function that counts the occurrences of x in arr[].
   
   This function uses inbuilt code and libraries of java for the job.
 *
 * @author Hemang Jain
 * @version 02/08/2023
 */
public class Occurences {
    static void func() {
        int []arr = {1,2,3,4,5,6,7,8,9,9,9,9,9,10};
        int x = 9;
        String n = Integer.toString(x);
        String str = Arrays.toString(arr).replaceAll("\\[|\\]|, |\\s", "");
        int i = str.indexOf(n);
        int j = str.lastIndexOf(n);
        System.out.println(j-i+1);
    }
}