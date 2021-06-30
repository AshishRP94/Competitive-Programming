package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int r=4;
		int c=4;
		int [][]arr=new int[r][c];
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[0].length;j++)
//			{
//				arr[i][j]=scan.nextInt();
//			}
//		}
	    int min=Math.min(r, c);
       	int order=2;
		while(order<=min)
		{
			for(int i=order;i<arr.length;i++)
			{
				for(int j=order;j<arr.length;j++)
				{
					System.out.println("i="+i+"j="+j);
					int t1=i-order+1;
					int t2=j-order+1;
					System.out.println("t1="+t1+"t2="+t2);
				}
			}
			System.out.println();
			order+=1;
			
		}
	}

}
