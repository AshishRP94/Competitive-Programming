package competitive_programming;

import java.util.Scanner;
import java.util.Stack;


public class Leetocde_Diameter_of_Binary_Tree
{
	
	
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
	
	
	static int max=Integer.MIN_VALUE;
    private static void init(int length)
	{
    	max=Integer.MIN_VALUE;
	}

	
	
	private static int height(node root)
	{
		if(root==null)
		{
			return 0;
		}
		int hl=0,hr=0;
		if(root.left!=null)
		{
		hl=height(root.left);
		}
		
		if(root.right!=null)
		{
		hr=height(root.right);
		}
		
		if(max<(1+hl+hr))
		{
			max=1+hl+hr;
		}
		int height=1+Math.max(hl,hr);
		return height;
		
		
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
		init(arr.length);
		node root=binary_tree(arr);
		height(root);
		
	}







}
