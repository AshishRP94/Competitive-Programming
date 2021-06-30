package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;


//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first line of each test case contains two space-separated integers N and D.
//The second line contains N space-separated integers a1,a2,…,aN.
//Anyone whose age is ≥80 or ≤9 is considered to be at risk

public class Vaccine_Distribution 
{
	private static int finddays(int n, int d, int[] age) 
	{
//		int [] risk=new int[n];
//		int [] normal =new int[n];
		int risk=0;
		int normal=0;
//		int x=0,y=0;
		for(int i=0;i<age.length;i++)
		{
			if(age[i]>=80 || age[i]<=9)
			{
				risk+=1;
				
			
			}
			else
			{
				normal+=1;
			}
		}
		int days=0;
		
		days=risk/d;
		
		if(risk%d!=0)
		{
			days+=1;
			
		}
		
		days+=normal/d;
		if(normal%d!=0)
		{
			days+=1;
			
		}
		
		
		
		
		return days;
	}

	
	public static void main(String[] args) 
	{
		
		int t=0;
		Scanner scan=new Scanner(System.in);
		t=scan.nextInt();
		int n;
		int d;
		int [] age;
		for(int i=0;i<t;i++)
		{
			n=scan.nextInt();
			d=scan.nextInt();
			age=new int[n];
			for(int j=0;j<n;j++)
			{
				age[j]=scan.nextInt();
			}
			System.out.println(finddays(n,d,age));
			
			
			
			
			
		}
	
	
	}


}
