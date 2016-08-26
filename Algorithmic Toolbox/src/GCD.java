
import java.io.*;
import java.util.*;

public class GCD {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers : - ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int GCD = EuciGCD(a,b);
	    System.out.println("GCD is : - " +GCD);
	   
	    
	}
	
	public static int EuciGCD(int a, int b)
	{   
		if(b == 0)
			return a;
		int best = a%b;
	    return EuciGCD(b,best);
		
	}
	
	
}

