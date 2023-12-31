import java.util.Arrays;
/**
 * Day 1 of 30
   Challenge: Find Kth largest element in a given array.
   (this is the easiest approach to this problem assuming all elements are unique,
   and we have the inbuilt sort function available at our disposal)
   (I will post another solution without using the inbuilt functions for sorting, and also
   taking care of identical elements)
 *
 * @author Hemang Jain
 * @version 01/08/2023
 */
public class Kth_Largest {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int k = 2;
        Arrays.sort(arr);
        System.out.println(k + " st/nd/rd/th largest element in the array is " + arr[arr.length-k]);
    }
}