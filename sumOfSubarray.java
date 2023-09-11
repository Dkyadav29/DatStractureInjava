


/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {	
        //  user input 
		Scanner  sc = new Scanner(System.in);	  
		 int n = sc.nextInt();
	     long a[] = new long[n];
		 for(int i =0; i < n; i++ ){
			a[i] = sc.nextLong();
		  }
// just take concept array reversal lookup concept not exact just some part m neglate 
		 
		// Total sum = Σ(Arr[i]*(i+1)*(N-i))    [from i=0 to i=N-1]
		long m = 1000000007;           
		 long  sumOfSubarray = 0;
		for(int j = 0; j < n ; j++){
			 sumOfSubarray +=(((j+1)%m*(n-j)%m)%m*a[j]%m)%m;		 
		}
		   long ans =  sumOfSubarray%m;
			System.out.println(ans);	
		
    }
}
