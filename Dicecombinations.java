package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ashish
 *
*/

class Dice
{
	
	
//	 static int [] arr;
//	public Dice()
//	 {
//		
//		arr=new int[1000];
//		for (int i = 0; i < arr.length; i++) 
//		{
//		arr[i]=0;	
//		}
//	
//	}
	
	 public int findcount(int n, int sum) 
	 {
		 if(sum==n)
		 {

			 sum=0;
			 return 1;
		 }
		 if(sum>n)
		 {

			 return 0;
		 }
		 
		 int tot=0;
		 for(int i=1;i<=6;i++)
		 {
			 if(sum<=n)
			 {
//				 if(sum+i!=0)
//				 {
//					 return arr[sum+i];
//				 }
//		
		tot=tot+findcount(n,sum+i);
//		arr[sum+i]=tot;	 
			 }

		 
		 
		 }
		 
		 
		 
		 return tot;
	}

}


class Dicecombinations 
 {

	
	 public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		Dice d=new Dice();
		System.out.println(d.findcount(n,sum));

		
		 int  []arr=new int[1000];
		 
			

	}

	
	

}
