// Pair with a Sum
// markAsDonemarkForRevision
// Given an array arr of N integers, and an integer K, Determine whether or not there exist two elements in arr whose sum is exactly K.

// Input Format

// The first line contains two spaced integers N and K denoting the size of the array and the target sum respectively.
// The second line contains N space-separated integers denoting the elements of the array.
// Output Format

// Print "Yes" if there exist two elements in arr whose sum is exactly K otherwise print "No".
// Input 1:

// 6 16
// 1 4 45 6 10 8
// Output 1:

// Yes
// Explanation:

// arr[3] + arr[4] = 6 + 10 = 16.
// Constraints:

// 1 ≤N≤ 10^5
// 1 ≤K≤ 2*10^5
// 1 ≤arr[i]≤ 10^5
// Example
// Input
// 6 16
// 1 4 45 6 10 8
// Output
// Yes


/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static String sumOfPairCheck(int[] arr, int k){
        int i = 0, j = arr.length -1;
        
        while(i < j){
            int currentSum = arr[i] + arr[j ];
            if(currentSum == k) return "Yes";
            else{
                if(currentSum < k) i++;
                else j--;
            }
            
        }
        return "No";
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)

            {

                arr[i] = sc.nextInt();

             }

Arrays.sort(arr);

System.out.println(sumOfPairCheck(arr, k));

}

}
    
