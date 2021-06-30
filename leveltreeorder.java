package competitive_programming;

//binary tree
import java.util.*;
public class leveltreeorder 
{
	static class node
	{
		node left;
		node right;
		int data;
		node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
		
	}
	

  static Queue<node> queue = new LinkedList<node>();
	private static void levelorder(node root) 
	{
	   
	        queue.add(root);
	        while (queue.isEmpty()==false) 
	        {
	            node tempNode = queue.poll();
	            System.out.print(tempNode.data + " ");
	 
	            if (tempNode.left != null) {
	                queue.add(tempNode.left);
	            }
	 
	            if (tempNode.right != null) 
	            {
	                queue.add(tempNode.right);
	            }
	        }
	    
	 
	}
	

	
	
	private static node insert(node root, int data) 
	{
		if(root==null)
		{
			return new node(data);
		}
		else
		{
			node cur;
			if(data<=root.data)
			{
				cur=insert(root.left,data);
				root.left=cur;
			}
			else
			{
				cur=insert(root.right,data);
				root.right=cur;
			}
			
			return root;
		}
		
	}

	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		node root=null;
		while(t-- >0)
		{
			int data=scan.nextInt();
			root=insert(root,data);
			
		}
//		System.out.println("sucessfully inserted");
		scan.close();
		levelorder(root);
		
	}



}
