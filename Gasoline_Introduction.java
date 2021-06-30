package competitive_programming;

import java.util.Scanner;

public class Gasoline_Introduction 
{
	private static int finddistance(int[] fuels) 
	{
		int distance=1;
		int car=fuels[0];
		car=car-1;
		fuels[0]=0;
		for(int i=1;i<fuels.length;i++)
		{
			System.out.println("distance"+distance+"car="+car+"fuels"+fuels[i]);

			 if(car-1>=0 || fuels[i]>0)
			{
				car=car-1;
				car=car+fuels[i];
				distance=distance+1;
				System.out.println("distance"+distance+"car="+car);
				fuels[i]=0;
				System.out.println(fuels[i]);
				
			}
			 else
			 {
				 break;
			 }
		
		
		
//			3
//			5
//			3 0 0 0 0
//			5
//			1 1 1 1 1
//			5
//			5 4 3 2 1
		
		}
		
		
		return distance+car;
	}
	
	
	
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
int n=0;
int []fuels;
for(int i=0;i<t;i++)
{
	n=scan.nextInt();
	fuels=new int[n];
	for(int j=0;j<fuels.length;j++)
	{
		fuels[j]=scan.nextInt();
	}
    System.out.println(finddistance(fuels));
	
	

	





}
}


}
