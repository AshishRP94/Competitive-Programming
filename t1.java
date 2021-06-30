package competitive_programming;

class u_binary_search_tree
{
	static class node
	{
		int data;
		node left,right;
		public node(int d)
		{
			data=d;
			left=right=null;
		}
		
	}
	
	node root;
	u_binary_search_tree()
	{
		root=null;
		
	}
	
	void insert(int data)
	{
		root=insertbst(root,data);
	}
	
	node insertbst(node root,int data)
	{
		if(root==null)
		{
			root=new node(data);
			return root;
		}
		
		
		if(data<root.data)
		{
		root.left=insertbst(root.left,data);
		}
		else if(data>root.data)
		{
		root.right=insertbst(root.right,data);	
		}
		
		return root;
	
	
	
	}
	
	void delete(int data)
	{
		root=deletenode(root,data);
	}
	
	
	
	
	
	private node deletenode(node root, int data) 
	{
		if(root==null)
		{
			return root;
		}
		if(data<root.data)
		{
			root.left=deletenode(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=deletenode(root.right,data);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				 return root.left;
				
			}
			root.data=minvalue(root.right);
			root.right=deletenode(root.right,root.data);
			
		
		
		
		}
		
		
		
		return root;
	}

	private int minvalue(node root) 
	{
		int min=root.data;
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
		}
		
		
		return min;
	}

	void inorder()
	{
		inorderr(root);
	}

	 void inorderr(node root2) 
	{
		if(root!=null)
		{
			inorderr(root.left);
			System.out.println(root.data);
			inorderr(root.right);
		}
	
	
	
	}



}





public class t1 {

	public static void main(String[] args) 
	{
		u_binary_search_tree tree=new u_binary_search_tree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);

		
//		tree.inorder();
		

	
	
	
	
	}

}
