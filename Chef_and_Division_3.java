package competitive_programming;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;




public class Chef_and_Division_3 
{

	
	
	//The first line of input contains a single integer T denoting the number of test cases. The description of T test cases follows.
	//The first line of each test case contains three space-separated integers - N, K and D respectively.
	//The second line of each test case contains N space-separated integers A1,A2,…,AN respectively.
	
	
	private static void findnoofcontest(int target, int days, int sum) 
	{
		int total=sum/target;
		if(total>=days)
		{
			
			System.out.println(days);
			
		}
		else
		{
			System.out.println(total);
			
			
		}
		
	
	
	
	
	}

	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			
		int nofsetters=scan.nextInt();
		int target=scan.nextInt();
		int days=scan.nextInt();
		int[] problems=new int[nofsetters];
		int sum=0;
		for(int s=0;s<nofsetters;s++)
		{
			problems[s]=scan.nextInt();
			sum+=problems[s];
		}
		findnoofcontest(target,days,sum);
		
		
//		5
//		1 5 31
//		4
//		1 10 3
//		23
//		2 5 7
//		20 36
//		2 5 10
//		19 2
//		3 3 300
//		1 1 1


		
	
		}
	
	
	}








}


