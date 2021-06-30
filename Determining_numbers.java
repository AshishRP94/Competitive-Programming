package competitive_programming;

import java.util.Scanner;

public class Determining_numbers {


//    8
//    1 2 3 4 5 5 3 4
//	  ans:=1,2

//	  xor
//	  1|1=0
//	  0|0=0
//    1|0=1
//	  0|1=1
	
	private static void uniquetwo(int[] arr)
	{
		int tempans=0;
		for(int i=0;i<arr.length;i++)
		{
			tempans=(tempans^arr[i]);
		}
		
		int rsb=(tempans&(-tempans));
		
		int firstnum=0;
		int secondnum=0;
		for(int i=0;i<32;i++)
		{
			if((arr[i]&rsb)==0)
			{
				firstnum^=(arr[i]);
				
				
			}
			else
			{
				secondnum^=(arr[i]);
				
			}
			
			
		}
		System.out.println(" "+firstnum+" "+secondnum);
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		uniquetwo(arr);
		
		
		
	}

	

}
