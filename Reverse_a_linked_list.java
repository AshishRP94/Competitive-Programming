package competitive_programming;

class LinkList
{
	//node class
	static class node //node class is associated with LinkList (we can acess this node class directly without creating the object of LinkList class )
	{
		int data;
		node next;
	}
	
	node head=null,tail=null;
	int size=0;
	
	void insert(int data)
	{
		
		node n=new node();
		if(head==null  && tail==null)
		{
			
			n.data=data;
			n.next=null;
			head=n;
			tail=n;
			size=size+1;
		}
		else
		{
			n.data=data;
			tail.next=n;
			tail=n;
			size=size+1;
			
		}
	}



	
	
	int size()
	{
		return size;
	}
	
	
	
	void display()
	{
		node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
			
		}
		System.out.print(temp.data+" ");
		System.out.println();

	}





void reverse(node l,node hi)
{

	if(l==hi)
	{
		
		return;
	
	}
	
	
	int t=l.data;
	l.data=hi.data;
	hi.data=t;

	node h=head;
	if(size%2==1)
	{
		
        while(h.next!=hi)
        {
        	
		h=h.next;
        }
		
	}
	else
	{
		  while(h!=hi)
	        {
	        	
			h=h.next;
	        }
			
		
	}
	

	reverse(l.next,h);
	
	
	
	
}


}


public class Reverse_a_linked_list 
{
	
	
	public static void main(String args[])
	{
		 LinkList l=new  LinkList();
		 l.insert(10);
		 l.insert(20);
		 l.insert(30);
		 l.insert(40);
		 l.insert(50);
		 l.display();
		 l.reverse(l.head,l.tail);
		 l.display();
		 
	
	
	
	
	}




}
