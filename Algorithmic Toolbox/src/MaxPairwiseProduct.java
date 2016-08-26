/*
Given a sequence of non-negative integers find the maximum 
pairwise product, that is, the largest integer that can be obtained by
multiplying two different elements from the sequence .
*/


import java.util.Scanner;
import java.util.*;

public class MaxPairwiseProduct {
	
	public static void main (String args []){
		
		Scanner sc = new Scanner (System.in);
		
		//Take size of array
		System.out.println("Number of entries : -");
		int n = sc.nextInt();
		long a [] = new long [n];
		
		//Take input of numbers in array
		System.out.println("Enter data :- ");
		for(int i=0;i<n;i++)
		{
			a [i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(a));
		
		long max1 = 0 ,max2 = 0;
		//Find max from array
		for(int i=0;i<n;i++)
		{
				if(a[i]>max1)
					max1 = a[i];   
		}
		
		//Find second max from array
		for(int i=0;i<n;i++)
		{
			if(a[i]<max1&&a[i]>max2)
		    	max2 = a[i];   
		}
		
		 
		System.out.println("Max1 : " +max1);
		System.out.println("Max2 : " +max2);
		
		//Output max pairwise product
		long product = max1*max2;
		System.out.println(product);
	}
}
