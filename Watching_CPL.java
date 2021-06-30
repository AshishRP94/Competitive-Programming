package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Watching_CPL {
	
	
	private static int helptracy(int height, int[] blocks) 
	{
		int count=0;
		Arrays.sort(blocks);
		int i=blocks.length-1;
		while(true)
		{
		//	System.out.println("i"+i);
			if(i==0)
			{
				break;
			}
			//System.out.println("height="+height);
			if(height>=0)
			{
				i-=1;
				height-=blocks[i];
				count+=1;
			}
			else
			{
				break;
			}
			
			
		
					
		}
			
		return count;
	}

	

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int nob=scan.nextInt();
			int height=scan.nextInt();
			int []blocks=new int[nob];
			for(int j=0;j<nob;j++)
			{
				blocks[j]=scan.nextInt();
			}
			
			System.out.println(helptracy((height*2),blocks));
			
		}
		
	
	
	
	}


}
