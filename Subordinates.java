package competitive_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Subordinates 
{
	
	static int []subtree=new int[100000]; 
	
	private static void find_no_of_subordinates(ArrayList<Integer>[] tree, int child, int parent)
	{
		int sum=0;
		int subchild;
		for(int i=0;i<tree[child].size();i++)
		{
//			System.out.println("i="+i);
			subchild=tree[child].get(i);
//			System.out.println("subchild="+subchild+" parent="+child);
			if(subchild==parent)
			{
				
			}
			else
			{
//				System.out.println("call="+subchild+"parent="+parent);
				find_no_of_subordinates(tree, subchild, child);
//				System.out.println("end="+subchild);
				sum+=subtree[subchild];
//				System.out.println("sum="+sum+"parent="+parent+"subchild="+subchild);
			}
			
			
		}
		subtree[child]=1+sum;
//		System.out.println("sum="+subtree[child]+"parent"+parent);
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer>[]tree=new ArrayList[n+1];
		
		for(int i=0;i<tree.length;i++)
		{
			tree[i]=new ArrayList<>();
		}
		
		for(int i=2;i<=n;i++)
		{
			int boss=scan.nextInt();
//			System.out.println("boss="+boss+"i="+i);
//			tree[i].add(boss);
			tree[boss].add(i);
		}
		find_no_of_subordinates(tree,1,1);
		for(int i=0;i<=n;i++)
		{
			System.out.print(" "+(subtree[i]-1));
		}
	
	}



}
