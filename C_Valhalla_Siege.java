package competitive_programming;

import java.util.Scanner;

//The first line contains two integers n and q (1≤n,q≤200000) — the number of warriors and the number of minutes in the battle.
//
//The second line contains n integers a1,a2,…,an (1≤ai≤109) that represent the warriors' strengths.
//
//The third line contains q integers k1,k2,…,kq (1≤ki≤1014), the i-th of them represents Lagertha's order at the i-th minute: ki arrows will attack the warriors.
public class C_Valhalla_Siege {
	
	private static void analyzewar(long[] warriors, long[] btime)
	{
		
//		long []prefixsum=new long[warriors.length];
//		int sum=0;
//		for(int i=0;i<warriors.length;i++)
//		{
//			sum+=warriors[i];
//			prefixsum[i]=sum;
//		}
			
			
		long []tempw=new long [warriors.length];
		for(int i=0;i<warriors.length;i++)
		{
			tempw[i]=warriors[i];
		}
		
		
		int j=0;
		boolean thorpower=false;
		for(int i=0;i<btime.length;i++)
		{
		long arrows=btime[i];
		
		System.out.println("arrows="+arrows);
		
		while(true)
		{
		System.out.println("j="+j);
		System.out.println(" while arrows="+arrows);
			
			if(arrows==0)
			{
				break;
			}
			if((j==(warriors.length-1))&&(arrows>0))
			{
				thorpower=true;
				break;
			}
			
	
			if(arrows>0)
			{
				long temp=warriors[j];
				System.out.println("temp="+temp);
				if(temp>arrows)
				{
					temp-=arrows;
					warriors[j]=temp;
					break;
				}
				else
				{
				arrows-=temp;
				System.out.println("if while arrows="+arrows);
				j+=1;
				}
			}
			else
			{
				break;
			}
		System.out.println();
			
		}
		System.out.println("ooooooooooooooouuuuuuuuuuuuuuttttttttttttt");
		if(thorpower==false)
		{
			
			System.out.println("->"+(warriors.length-j));
		}
		else
		{
			System.out.println(""+(warriors.length));
			thorpower=false;
			for(int t=0;t<warriors.length;t++)
			{
				warriors[t]=tempw[t];
			}
			j=0;
		}
		
		
		}
		
		
		
		
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
