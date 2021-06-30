package competitive_programming;


class Tree
{
	static class Node
	{
		
	int data;
	Node left;
	Node right;
	
    Node(int d)
	{
    	data=d;
		left =null;
		right=null;
		
	}
	}
	
	
	void insertleft(Node n,int d)
	{
		if(n.left!=null)
		{
			insertleft(n.left,d);
		}
		n.left= new Node (d);
		
		
		
		}
	
	void insertright(Node n,int d)
	{
		if(n.right!=null)
			
		{
			insertright(n.right,d);
		}
		n.right=new Node(d);
		
	}



public void traverse(Node n)
{
	if(n!=null)
	{
	
	
	System.out.println(n.data);
	traverse(n.left);
	traverse(n.right);
	}
	
}
}

public class ChristmasSpruce 
{
	public static void main(String args[]) 
	{
		Tree t=new Tree();
		Tree.Node n=new Tree.Node(1);
	t.insertleft(n, 1);
	t.insertright(n, 3);
	t.insertleft(n, 6);
	t.insertright(n, 7);

	t.insertleft(n, 2);
	t.insertleft(n, 4);
	t.insertright(n, 5);
	t.traverse(n);
	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}
}
