package competitive_programming;

import java.util.Scanner;

//The first line of each test case contains three space-separated integers N, Q and s.
//The second line contains N space-separated integers H1,H2,…,HN.
//Each of the following Q lines contains two space-separated integers x and y describing a query. The parameters L and R for this query can be computed as follows:
//Let last be the answer to the previous query, or 0 if this is the first query in this test case.
//Set L to (x+s⋅last−1)%N+1.
//Set R to (y+s⋅last−1)%N+1.
//If L>R, swap L and R.

public class Unusual_Queries 
{
	private static int findsatisfaction(int[] height, int l, int r) 
	{
		if (l + 1 == r || r + 1 == l) 
		{
			return 1;

		}
		
		int[] ans = new int[height.length];
		int j = 0;
		int count = 0;
		for (int i = l; i < r - 1; i++) 
		{

			if (height[i] < height[i + 1]) 
			{
				count = count + 1;

			}
			else if (i >= height[i + 1]) 
			{
			ans[j]=count;
			count=0;
			}

	  }
		int max=Integer.MIN_VALUE;
		for(int l1=0; l1<ans.length;l1++)
		{
			if(ans[l1]>=max)
			{
				max=ans[l1];
			}
		}

		return max;
	}

	private static int transform(int z, int s, int last, int n)
	{
		return ((z + (s * last) - 1) % n);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		int n = 0, queries = 0, s;
		int x, y;
		int last = 0;
		int l = 0, r = 0;
	

			n = scan.nextInt();
			int[] height = new int[n];

			queries = scan.nextInt();
			int res[] = new int[queries];

			s = scan.nextInt();
			
			for (int h = 0; h < n; h++) 
			{
				height[h] = scan.nextInt();
			}


			for (int j = 0; j < queries; j++) 
			{
				x = scan.nextInt();
				y = scan.nextInt();
				l = transform(x, s, last, n + 1);
				r = transform(y, s, last, n + 1);
				System.out.println("l="+l+"r="+r);
				if (l > r) 
				{
					int temp = l;
					l = r;
					r = l;
				}
				res[j] = findsatisfaction(height, l, r);
				last = res[j];

			}
				for (int z = 0; z < queries; z++) {

					System.out.println(res[z]);


		}

	}
}

//6 3 0
//4 2 3 1 5 5
//1 6
//2 4
//3 4