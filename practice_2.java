package competitive_programming;

import java.util.Scanner;

public class practice_2 {
	
	private static void pract(int i)
	{
		if(i==0)
		{
			System.out.println("i="+i);
			return;
		}
		
		System.out.println("Before i="+i);
		pract(i=i-1);
		System.out.println("After i="+i);
		
		
		
	}
	
	
	
	
	private static void pract_2(int i)
	{
		if(i==0)
		{
			System.out.println("i="+i);
			return;
		}
		
		System.out.println("Before i="+i);
		pract(i-1);
		System.out.println("After i="+i);
			
	}
	
	
	   static int gcd(int a, int b)
	    {
	        if (a == 0)
	            return b;
	        return gcd(b % a, a);
	    }

	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int []arr=new int[3];
	arr[0]=7;
	arr[1]=5;
	arr[2]=3;
		
	
	int []arr1=new int[3];
	arr1[0]=1;
	arr1[1]=1;
	arr1[2]=1;
	int c=0;
	for(int i=0;i<arr.length;i++)
	{
		arr[c]++;
		System.out.println(""+arr[i]+"c"+c);
		
	}
	scan.next();
		int n=5;
	
		int yo='a';
		System.out.println(yo);
		for(int i=1;i<20;i++)
		{
			for(int k=1;k<20;k++)
			{
				System.out.println(""+i+"|"+k+"="+gcd(i, k));
			}
		}
	
		System.out.println(1&13);
		System.out.println(""+(13&2));
		System.out.println(""+(13&4));
		System.out.println(""+('A'-'A'));
		System.out.println(""+('B'-'A'));
		
		
		int j=2;
		call(j+3);
		System.out.println("j="+j);
		call(j+=3);
		System.out.println("j="+j);
		pract(5);
		System.out.println();
		System.out.println();
		pract_2(5);
		
	}




	private static void call(int i) {
		// TODO Auto-generated method stub
		
	}





}
