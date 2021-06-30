package competitive_programming;

import java.util.Scanner;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;


import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;





public class cookoff1 
{
	
	
//	First line will contain T, the number of testcases. Then the testcases follow.
//	Each testcase contains two lines of input.
//	The first line of each testcase contains a single integer, N, the number of days till now.
//	The second line of each testcase contains a string B of length N where Bi represents the status of the ith day.

	private static void findresult(int n, String rec) 
	{
int cpd=0;
		for(int i=0;i<rec.length();i++)
		{
			if(rec.charAt(i)=='1')
			{
				cpd+=1;
			}
			
		}
		int temp=cpd+(120-n);
		int d=120;
		double ans=((double)temp/(double)120)*100;
		double threshold=75.00;
		if(ans>=threshold)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
			
		}
		
		
	}
	
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
//		Reader scan=new Reader();
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			scan.nextLine();
			String record=scan.nextLine();
			findresult(n,record);
			
		}
		
			
		
		
		
		


		
	
	
	
	}









}




