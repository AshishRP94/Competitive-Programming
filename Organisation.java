package competitive_programming;

import java.util.Arrays;
import java.util.Scanner;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;


import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;





public class Organisation 
{
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
	
	private static void find(int boxes, int capacity, int[] col) 
	{
		long ducks=boxes*capacity;
		boolean [] bool=new boolean[col.length];
		for(int i=0;i<bool.length;i++)
		{
			bool[i]=false;
		}
		int count=0;
		int i=0;
		int t=0;
		int c=capacity;
		for(int in=0;in<boxes;in++)
		{
//			System.out.println("i="+i);
			if(bool[i]==false)
			{
				
			int c1=col[i];
//			System.out.println("i="+i);
			bool[i]=true;
			int c2=search(col,capacity-c1,bool);
			if(c2==-1)
			{
				
			}
			else
			{
				
				bool[c2]=true;
			}
			
			System.out.print(""+(i)+" "+col[i]+" ");
			if(c2==-1)
			{
				int o=0;
				System.out.print(""+(o)+" "+o+" ");
				
			}
			else
			{
				System.out.print(""+(c2)+" "+col[c2]+" ");
				
			}
			}
			while(true)
			{
				if(i>bool.length-1)
				{
					i=0;
				}
//				System.out.println("i="+i);
				if(bool[i]==false)
				{
					break;
				}
					
				i=i+1;
			}
			System.out.println();
		}
			
		
		
		System.out.println();
	
			
	}

	private static int search(int[] col, int k, boolean[] bool) 
	{
	
		if(k==0)
		{
			return -1;
		}
		else
		{
			for(int i=0;i<col.length;i++)
			{
				if(col[i]==k && bool[i]==false)
				{
					return i;
				}
			
			
			}
			
		}
		return 0;
	}
		
	

	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan=new Reader();
		int t=scan.nextInt();
			for(int i=0;i<t;i++)
			{
			int n=scan.nextInt();
			int k=scan.nextInt();
			int []col=new int[n+1];
			for(int ii=0;ii<col.length;ii++)
			{
				col[ii]=scan.nextInt();
				
			}
			find(n,k,col);
			}
			
			
		
		
		
		


		
	
	
	
	}






}






