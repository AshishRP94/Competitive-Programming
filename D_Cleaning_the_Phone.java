package competitive_programming;

import java.util.HashMap;
import java.util.Scanner;

public class D_Cleaning_the_Phone {

//	The first line contains one integer t (1≤t≤104) — the number of test cases. Then t test cases follow.

	
//	The first line of each test case contains two integers n and m (1≤n≤2⋅105, 1≤m≤109) — 
//	the number of applications on Polycarp's phone and the number of memory units to be freed.
//	The second line of each test case contains n integers a1,a2,…,an (1≤ai≤109) — the number of memory units used by applications.

//	The third line of each test case contains n integers b1,b2,…,bn (1≤bi≤2) — the convenience points of each application.
//	It is guaranteed that the sum of n over all test cases does not exceed 2⋅105.
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
			for(int j=0;j<n;j++)
			{
				int temp=scan.nextInt();
				hm.put(temp, 0);
			}
			
			for(int k=0;k<m;k++)
			{
				int temp=scan.nextInt();
				
			}
		}
		
	}

}
