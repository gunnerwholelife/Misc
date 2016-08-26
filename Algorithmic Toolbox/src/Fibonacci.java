import java.io.*;
import java.util.*;


public class Fibonacci {

	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n  : - ");
        int n = sc.nextInt();
        
        
        long x[] = new long [n];
        x[0]=0;
        x[1]=1;
        for(int i=2;i<n;i++)
        {
        	x[i]=x[i-1]+x[i-2];
        }
        System.out.println(Arrays.toString(x));
        long k = x[n-1]+x[n-2];
        System.out.println("The last term in the series is :- " +k);
        
}
}
