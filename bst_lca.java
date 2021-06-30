package competitive_programming;

import java.util.*;
import java.io.*;
//binary search tree
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class bst_lca {

static //    static ArrayList<Node> arr=new ArrayList<Node>(); 
    LinkedList<Node> arr = new LinkedList<Node>();

    public static  void ntr(Node root, int v) 
    {
    	System.out.println("s="+arr.size()+" v="+v);
    	if(root.data==v)
    	{
    		System.out.println(" .."+root.data+",");
    		arr.add(root);
    		return;
    		
    	}
    	
    	else if(root.left==null)
    	{
    		return ;
    	}
    	
    	else if (root.right==null)
    	{
    		return;
    	}
    	
    
    	if(v<root.data)
    	{
    		System.out.println(" "+root.data+",");
    		arr.add(root);
    		ntr(root.left, v);
    	}
    	
    	if(v>root.data)
    	{
    		System.out.print(" "+root.data+",");
    		arr.add(root);
    		ntr(root.right,v);
    	}
    	
    	
		return;
        
        
          
    }
    
	public static Node lca(Node root, int v1, int v2) 
    {
        ArrayList<Node> fvrtn=new ArrayList<Node>();
        ArrayList<Node> svrtn=new ArrayList<Node>();
        ntr(root,v1);
        int l=arr.size();
        System.out.println();
        System.out.println("l="+l);
        for(int i=0;i<arr.size();i++)
        {
        	Node temp=arr.remove(i);
        	System.out.println("temp="+temp.data);
        	fvrtn.add(temp);
        }
        System.out.println("size="+arr.size());
        ntr(root,v2);
        l=arr.size();
        System.out.print(l+" ");
        for(int i=0;i<l;i++)
        {
        	svrtn.add(arr.remove(i));
        }
        
        for(int i=0;i<arr.size();i++)
        {
        	if(fvrtn.get(i).data==svrtn.get(i).data)
        	{
        		return fvrtn.get(i);
        		
        	}
        }
        
        
		return root;
        
      	
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}