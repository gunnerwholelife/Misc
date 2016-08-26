//This program takes n numbers as input and gives out the largest possible number formed by the n number inputs.
//EG : - 3 , 7, 4, 9 ; - 9743


import java.io.*;
import java.util.*;
import java.math.*;
public class largestnumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : - ");
        int n = sc.nextInt();
        int temp = 0;
        int a[] = new int[n];
        System.out.println("Enter the numbers :- ");
        for(int i=0;i<n;i++)
        { 
          a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
        for(int j=1;j<a.length-i;j++)
        {
        if(a[j]>a[j-1])
        {
         temp = a[j];
         a[j] = a[j-1];
         a[j-1] = temp;
        }
        }
        	
        }
        System.out.println(Arrays.toString(a));
        int j = a.length-1;
        System.out.println("Array length : - " +j);
        int k = 0;
        for(int i=0;i<a.length;i++)
        {
        	k = (int) (k+a[i]*Math.pow(10,j));
        	j--;
        }
        System.out.println("The largest possible digit is : - " +k);
	}
}

