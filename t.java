package competitive_programming;

class u_binary_tree 
{

	static class node 
	{

		int data;
		node left, right;

		public node(int item)

		{
			data = item;
			left = right = null;

		}
		
		

	}
	
	node root;
	u_binary_tree(int data)
	{
		root=new node(data);
		
	}
	
	u_binary_tree()
	{
		root=null;
	}
	
	

}

public class t {

	public static void main(String args[]) 
	{
		u_binary_tree tree=new u_binary_tree();
		tree.root=new u_binary_tree.node(10);
		tree.root.left=new u_binary_tree.node(20);
		tree.root.right=new u_binary_tree.node(30);
		tree.root.left.left=new u_binary_tree.node(21);
		tree.root.right.right=new u_binary_tree.node(31);
		
		
		
	
	
	
	
	}

}
