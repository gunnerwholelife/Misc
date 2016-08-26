
import java.io.*;
import java.util.*;

public class pisanonumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : - ");
		int n = sc.nextInt();
		long a = 0;
		long b = 1;
		int k = n*n;
		long t = 0,t1=0;
		int count=2;
		long pisano = 0;
		int i=0;
		do
		{
			t = a + b;
			a = b;
			b = t;
			pisano = t%n;
			if(pisano==0)
			{
				t1 = (a + b)%n;
				if(t1 == 1)
				{   //System.out.println(t +" "+pisano);
					break;
				}
			}
			count++;
			i++;
			System.out.println(t +" "+pisano);
		}while(i<k);
        System.out.println(count);
	}
}


