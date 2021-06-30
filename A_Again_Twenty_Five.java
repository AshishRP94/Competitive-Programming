package competitive_programming;

import java.util.Scanner;

public class A_Again_Twenty_Five {
	
	
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		double temp;
		temp=Math.pow(5, n);
		long t=(long)temp;
		long res=0;
		res=t%10;
		t=t/10;
		System.out.print(t%10+""+res);
		
			
		}
		
		
		
		
		
		
	
	

}
