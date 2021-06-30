package competitive_programming;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class B_Card_Deck {
	
	
	static class Reader
	{
	
	final private int BUFFER_SIZE = 1 << 16; 
	private DataInputStream din; 
	private byte[] buffer; 
	private int bufferPointer, bytesRead; 

	public Reader() 
	{ 
		din = new DataInputStream(System.in);
		buffer = new byte[BUFFER_SIZE]; 
		bufferPointer = bytesRead = 0; 
	} 

	public Reader(String file_name) throws IOException 
	{ 
		din = new DataInputStream(new FileInputStream(file_name)); 
		buffer = new byte[BUFFER_SIZE]; 
		bufferPointer = bytesRead = 0; 
	} 

	public String readLine() throws IOException 
	{ 
		byte[] buf = new byte[64]; // line length 
		int cnt = 0, c; 
		while ((c = read()) != -1) 
		{ 
			if (c == '\n') 
				break; 
			buf[cnt++] = (byte) c; 
		} 
		return new String(buf, 0, cnt); 
	} 

	public int nextInt() throws IOException 
	{ 
		int ret = 0; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 
		do
		{ 
			ret = ret * 10 + c - '0'; 
		} while ((c = read()) >= '0' && c <= '9'); 

		if (neg) 
			return -ret; 
		return ret; 
	} 

	public long nextLong() throws IOException 
	{ 
		long ret = 0; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 
		do { 
			ret = ret * 10 + c - '0'; 
		} 
		while ((c = read()) >= '0' && c <= '9'); 
		if (neg) 
			return -ret; 
		return ret; 
	} 

	public double nextDouble() throws IOException 
	{ 
		double ret = 0, div = 1; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 

		do { 
			ret = ret * 10 + c - '0'; 
		} 
		while ((c = read()) >= '0' && c <= '9'); 

		if (c == '.') 
		{ 
			while ((c = read()) >= '0' && c <= '9') 
			{ 
				ret += (c - '0') / (div *= 10); 
			} 
		} 

		if (neg) 
			return -ret; 
		return ret; 
	} 

	private void fillBuffer() throws IOException 
	{ 
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
		if (bytesRead == -1) 
			buffer[0] = -1; 
	} 

	private byte read() throws IOException 
	{ 
		if (bufferPointer == bytesRead) 
			fillBuffer(); 
		return buffer[bufferPointer++]; 
	} 

	public void close() throws IOException 
	{ 
		if (din == null) 
			return; 
		din.close(); 
	} 
} 	
	

//	The first line contains a single integer t (1≤t≤1000) — the number of test cases.
//	The first line of each test case contains the single integer n (1≤n≤105) — the size of deck you have.
//	The second line contains n integers p1,p2,…,pn (1≤pi≤n; pi≠pj if i≠j) — values of card in the deck from bottom to top.
//	It's guaranteed that the sum of n over all test cases doesn't exceed 105.
	
	
	private static int max(int[] cards, boolean[] visited)
	{
		int max=Integer.MIN_VALUE;
		int j=0;
		for(int i=0;i<visited.length;i++)
		{
			if(max<cards[i] && visited[i]==false)
			{
				max=cards[i];
				j=i;
			}
		}
		return j;
	}
	
	
	private static void findmaxorder(int[] cards, int n) throws UnsupportedEncodingException
	{
		
		Queue<Integer>queue=new LinkedList<>();

		int max;
		int count=0;
		boolean []visited=new boolean[cards.length];
		for(int i=0;i<cards.length;i++)
		{
//			System.out.println("i="+i);
			int ind=max(cards,visited);
//			System.out.println("ind"+ind);
			max=cards[ind];
//			System.out.println("max"+max);
			if(visited[ind]==false)
			{
				for(int j=ind;j<visited.length;j++)
				{
//					System.out.println("j="+j);
//					System.out.println("cards[j]="+cards[j]);
					if(visited[j]==false)
					{
						queue.add(cards[j]);
						
					}
					count+=1;
					visited[j]=true;
				}
			}
		
		}
		
		if(count==cards.length-1)
		{
			for(int j=0;j<cards.length;j++)
			{
				if(visited[j]==false)
				{
					queue.add(cards[j]);
				}
				
			}
			
		}
		
		
//		System.out.println("hi");
		int len=queue.size();
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		for(int i=0;i<len;i++)
		{
			int ans=queue.poll();
			System.out.print(ans+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
	}
	


	public static void main(String[] args) throws IOException
	{
//		Scanner scan=new Scanner(System.in);
		Reader scan=new Reader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []cards=new int[n];
			for(int j=0;j<cards.length;j++)
			{
				cards[j]=scan.nextInt();
			}
			findmaxorder(cards,n);
		}

	}



}
