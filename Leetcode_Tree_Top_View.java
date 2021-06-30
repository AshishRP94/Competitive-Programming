package competitive_programming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;



public class Leetcode_Tree_Top_View {
	
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
	
    static TreeMap<Integer,Integer>hms=new TreeMap<Integer,Integer>();
    private static void init()
   {
       hms.clear();
   }
   
   private static void top_view(node root, int temp)
   {
       Queue<pair>qu=new LinkedList<>();
       qu.add(new pair(root,0));
       while(true)
       {
           if(qu.size()<=0)
           {
               break;
           }
           pair temps=qu.poll();
           if(hms.containsKey(temps.state)==false)
           {
               hms.put(temps.state,temps.n.data);

           }
           
           if(temps.n.left!=null)
           {
           qu.add(new pair(temps.n.left,temps.state-1));
           }
           
           if(temps.n.right!=null)
           {

           qu.add(new pair(temps.n.right,temps.state+1));  
           }
           
       }
  
       
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
		top_view(root,0);
		for(int keys:hms.keySet())
		{
			System.out.println(hms.get(keys)+" ");
		}
		
		
		
	}








}
