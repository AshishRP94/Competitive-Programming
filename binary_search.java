package competitive_programming;
import java.util.Scanner;

public class binary_search 
{
	
	
	private static void analyzewar(long[] warriors, long[] btime)
	{
		
		
		
		
		
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int now=scan.nextInt();
		int minutes=scan.nextInt();
		long []warriors=new long[now];
		long []btime=new long[minutes];
		
		for(int i=0;i<warriors.length;i++)
		{
			warriors[i]=scan.nextInt();
		}
		
		for(int i=0;i<btime.length;i++)
		{
			btime[i]=scan.nextInt();
		}
		
		analyzewar(warriors,btime);
		
		
		
	}


	


}
