package competitive_programming;

import java.util.Scanner;
import java.util.Stack;




public class Leetcode_Find_Bottom_Left_Tree_Value {
	
	
	static class node
	{
		int data;
		node left=null;
		node right=null;
		node(int data,node left,node right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	
	
	static class pair
	{
		node n=null;
		int state=0;
		pair(node n,int state)
		{
			this.n=n;
			this.state=state;
		}
	}
	
	static class Pair
	{
		node n=null;
		char val;
		int level=0;
		Pair(node n,char val,int level)
		{
			this.n=n;
			this.val=val;
			this.level=level;
		}
	}
	
	private static node binary_tree(int[] arr)
	{
		node root=new node(arr[0],null,null);
		Stack<pair>st=new Stack<pair>();
		st.add(new pair(root,1));
		int i=0;
		while(true)
		{
			if(st.size()<=0)
			{
				break;
			}
			pair p=st.pop();
			if(p.state==1)
			{
				i+=1;
				if(arr[i]!=-1)
				{
					node temp=new node(arr[i],null,null); 
					p.n.left=temp;
					st.add(new pair(temp,1));
				}
				p.state=p.state+1;	
			}
			else if(p.state==2)
			{
				i+=1;
				if(arr[i]!=-1)
				{
					node temp=new node(arr[i],null,null); 
					p.n.right=temp;
					st.add(new pair(temp,1));
				}
				p.state=p.state+1;	
			}
			else
			{
				st.pop();
		    }
			
		}
		return root;
	}
	
	static int last=0;
	static int change=Integer.MIN_VALUE;
	private static void bottomview(node root, int level)
	{
		if(root==null)
		{
			return;
		}
		
		if(change<level)
		{
			change=level;
			last=root.data;
		}
		
		bottomview(root.left, level);
		bottomview(root.right, level);
		
	}

	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	
			
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		node root=binary_tree(arr);
		bottomview(root,0);
		System.out.println(""+last);
		
		
	
	}


}
