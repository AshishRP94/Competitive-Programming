package competitive_programming;

import java.util.Scanner;

public class Chef_and_Meetings {

//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first line of each test case contains a single time P.
//	The second line contains a single integer N.
//	N lines follow. For each valid i, the i-th of these lines contains two space-separated times Li and Ri.
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String chefmeet=scan.nextLine().trim();
			
			
			
			
			String s=(""+chefmeet.charAt(0)+""+chefmeet.charAt(1)+""+chefmeet.charAt(3)+""+chefmeet.charAt(4));
			System.out.println("s="+s+"!"+chefmeet.charAt(chefmeet.length()-2));
			int ctime=Integer.parseInt((s));
			int ind=(chefmeet.length()-2);
				
			int friends=scan.nextInt();
			int count=0;
			scan.nextLine();
			for(int j=0;j<friends;j++)
			{
				String ftime=scan.nextLine().trim();
				String start=(""+ftime.charAt(0)+""+ftime.charAt(1)+""+ftime.charAt(3)+""+ftime.charAt(4));
//				5
				int st=Integer.parseInt(start);
				String end=(""+ftime.charAt(7)+""+ftime.charAt(8)+""+ftime.charAt(10)+""+ftime.charAt(11));
				int en=Integer.parseInt(end);
//				12
				
				if(st==1159)
				{
					if(ftime.charAt(5)=='A')
					{
						
						
					}
					else
					{
						
					}
					
					
				}
				
				if((st<=ctime) && (chefmeet.charAt(ind)==ftime.charAt(5)))
				{
					
					
					
					
				}
				else
				{
					
					
				}
				
				
			}
		}
		
	}

}
