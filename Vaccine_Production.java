package competitive_programming;

import java.util.Scanner;

public class Vaccine_Production 
{
	private static int finddays(int daya, int capa, int dayb, int capb, int vaccines) 
	{
		int mdays=0;
		int vaccp=0;
		while(true)
		{

			if(vaccp>=vaccines)
			{
				break;
			}
			mdays+=1;

			
			
			if(mdays>=daya)
			{

				vaccp+=capa;
				
			}
			
			if(mdays>=dayb)
			{
				vaccp+=capb;

			}
			
			
			
			
			
		}
		
		
		return mdays;
	}
	
	
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int daya,capa;
	int dayb,capb;
	int vaccines;
	daya=scan.nextInt();
	capa=scan.nextInt();
	dayb=scan.nextInt();
	capb=scan.nextInt();
	vaccines=scan.nextInt();
	System.out.println(finddays(daya,capa,dayb,capb,vaccines));
	
	
	



}


}
