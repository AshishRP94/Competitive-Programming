package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

public class C_Sagheer_and_Nubian_Market
{

//	The first line contains two integers n and S (1 ≤ n ≤ 105 and 1 ≤ S ≤ 109) — the number of ccc in the market and Sagheer's budget.
//	The second line contains n space-separated integers a1, a2, ..., an (1 ≤ ai ≤ 105) — the base costs of the souvenirs
	static class pair
	{
		int x=0;
		int y=0;
		pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	
	private static void souvenirs(int item, int budget, int[] base)
	{
		int []k=new int[(base.length+1)];
		for(int i=0;i<k.length;i++)
		{
			k[i]=(i+1);
		}
		Arrays.sort(base);
		pair ans=new pair(0,0);
		ans.x=Integer.MIN_VALUE;
		
	    int low=0;
	    int high=(base.length-1);
	    int mid=0;
		while(low<=high)
		{
			mid=(low+((high-low)/2));
			System.out.println("mid="+mid);
			int sel=k[mid];
			System.out.println("sel="+sel);
			int bud=budget;
			int countitems=0;
			
		for(int i=0;i<base.length;i++)
		{
			
			System.out.println("base="+base[i]+"|i="+i+"|sel="+sel);
			int t=(base[i]+((i+1)*sel));
			System.out.println("t+"+t);
		
			bud-=t;
			System.out.println("bud="+bud);
			if((bud>=0) && (sel!=countitems))
			{
			
				countitems+=1;
				System.out.println("count="+countitems);
			}
			else
			{

				bud+=t;
				System.out.println("bud="+bud);
				break;
								
			}
			System.out.println();
		}
		
		if(countitems>ans.x)
		{
			System.out.println("if ");
			ans.x=countitems;
			System.out.println("ans.x="+ans.x);
			System.out.println("budget="+budget+"|bud="+bud);
			ans.y=(budget-bud);
			System.out.println("ans.y="+ans.y);
		}
		
		if((countitems==ans.x) && ((budget-bud)<ans.y))
		{
			ans.y=budget-bud;
	
		}
		
		System.out.println("out");
		
		if(sel==countitems)
		{

			low=mid+1;
			System.out.println("low="+low);
		}
		else
		{
			high=mid-1;
			System.out.println("high="+high);
		}

		System.out.println();
		}
		
		System.out.println(""+ans.x+" "+ans.y);
		
		
		
		
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int item=scan.nextInt();
		int budget=scan.nextInt();
		int []arr=new int[item];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		souvenirs(item,budget,arr);
	}


}
