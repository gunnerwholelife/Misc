//Program to calculate the minimum stops required to refuel car when travelling from A to B.
//Given stop distance and car tank capacity.
import java.io.*;
import java.util.*;

public class minRefill {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a [] = {0,400,800,1200,1300,1400};
		int tank = 400;
		int minRef = minRefills(a,tank);
        System.out.println("The minimum refills required to reach from A to B is :- " +minRef);
	}
	
	public static int minRefills(int a [],int tank)
	{
	  int n = a.length;
	  int currentRefil = 0;
	  int lastRefil = 0;
	  int numRefil = 0;

	  while(currentRefil < n)
	  {
		  lastRefil = currentRefil;
		  while(currentRefil<n && (a[currentRefil]-a[lastRefil])<=tank)
		  {   

			  currentRefil += 1;
		  }
		  if (lastRefil == currentRefil)
		  {
			  return -1;
		  }
		  
		  if (currentRefil<=n)
		  {
			  numRefil = numRefil +1;
		  }
		  
	  }
		
	  return numRefil;	
	}
}

