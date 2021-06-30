package competitive_programming;

import java.util.HashSet;
import java.util.Scanner;

public class Valid_Pair {

	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			HashSet<Long>hs=new HashSet<Long>();
			long a=scan.nextLong();
			hs.add(a);

			long b=scan.nextLong();
			hs.add(b);
			long c=scan.nextLong();
			hs.add(c);
			if(hs.size()<3)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
			
		}

	}

}
