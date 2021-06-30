package competitive_programming;

import java.util.Scanner;

public class Codeforces_Round_700_2 {

//	Each test contains multiple test cases. The first line contains t (1≤t≤105) — the number of test cases. Description of the test cases follows.
//	The first line of each test case contains three integers A (1≤A≤109), B (1≤B≤109) and n (1≤n≤105) — the attack power of the great hero,
//	the initial health value of the great hero, and the number of monsters.
//	The second line of each test case contains n integers a1,a2,…,an (1≤ai≤109), where ai denotes the attack power of the i-th monster.
//	The third line of each test case contains n integers b1,b2,…,bn (1≤bi≤109), where bi denotes the initial health value of the i-th monster.
	
	
	private static void defeat_monsters(long heroack, long heroheal, long[] monstersack, long[] monstersheal)
	{
		boolean flag=false;
//		int kill=0;
		boolean sp=false;
		for(int i=0;i<monstersack.length;i++)
		{
			long mh=monstersheal[i];
			long rmh;
			if((mh%heroack)==0)
			{
				rmh=mh/heroack;
				
			}
			else
			{
				rmh=mh/heroack;
				rmh+=1;
			}
			heroheal=((heroheal)-(rmh*monstersack[i]));
			
			if(i==monstersack.length-1)
			{
				long heroh=heroheal;
				
				if(heroh+monstersack[i]>=1)
				{
					System.out.println("YES");
					sp=true;
					break;
				}
			}
			
			if(heroheal<=0)
			{
				flag=true;
				break;
			}

		}
		
		if(sp==true)	
		{
			return;
		}

		
		if(flag==true)
		{
			System.out.println("NO");
			
		}
		else
		{
			System.out.println("YES");
			
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long heroack=scan.nextLong();
			long heroheal=scan.nextLong();
			int n=scan.nextInt();
			long []monstersheal=new long[n];
			long []monstersack=new long[n];
			for(int j=0;j<monstersheal.length;j++)
			{
				monstersack[j]=scan.nextLong();
				
			}
			
			for(int j=0;j<monstersheal.length;j++)
			{
				monstersheal[j]=scan.nextLong();
			}
			
			defeat_monsters(heroack,heroheal,monstersack,monstersheal);
			
		}

	}



}
