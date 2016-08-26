
import java.io.*;
import java.util.*;

public class LCM {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : - ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		GCD x = new GCD();
		int GCD = x.EuciGCD(a,b);
		int LCM = (a*b)/GCD;
		System.out.println("LCM is : - " +LCM);
	}
}

