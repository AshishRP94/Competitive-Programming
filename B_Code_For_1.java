package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class B_Code_For_1 {

//	The first line contains three integers n, l, r (0 ≤ n < 250, 0 ≤ r - l ≤ 105, r ≥ 1, l ≥ 1) – initial element and the range l to r.
//	It is guaranteed that r is not greater than the length of the final list.
	

    static ArrayList<Integer>arr=new ArrayList<Integer>();
	private static void find_ones(int n, int l, int r)
	{
		if(n<0)
		{
			return;
		}
		
		if(n==1||n==0)
		{
			arr.add(n);
			return;
		}
		
		
		find_ones((n>>1),l,r);
		find_ones(n%2,l,r);
		find_ones((n>>1),l,r);
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int l=scan.nextInt();
		int r=scan.nextInt();
		find_ones(n,l,r);
		int cones=0;
		for(int i=l;i<=r;i++)
		{
			if(arr.get(i)==1)
			{
				cones+=1;
			}
		}
		System.out.println(""+cones);
	
		
	}



}
