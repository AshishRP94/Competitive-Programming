package competitive_programming;


import java.util.Collections;
import java.util.PriorityQueue;
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




public class SaveKonoha 
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
	


	
	private static int think(long painpow, int[] solip) 
	{
		
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>(Collections.reverseOrder()); 

//	    System.out.println("in think");
		for(int i=0;i<solip.length;i++)
	    {
	    	pqueue.add(solip[i]);
	    }
		
		boolean flag=false;
		int count=0;
		
		while(painpow>=0)
		{
			if(pqueue.size()==0)
			{
				if(painpow!=0)
				{
					flag=true;
					break;
					
				}
		
			}
			int temp=pqueue.poll();
//			System.out.println("temp"+temp);
			painpow=painpow-temp;
//			System.out.println("painpow"+painpow);
			int t=temp/2;
//			System.out.println("t="+t);
			if(t==0)
			{
				
			}
			else
			{
				pqueue.add(t);
			}
//			System.out.println("count"+count);
			count=count+1;
			
		}
	    
	
	    if(flag==true)
	    {
	    	return 0;
	    }
	    else
	    {
	    	return count;
	    	
	    }

//	    1
//	    5 25
//	    7 13 8 17 3
       
		
		
	}

	
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan=new Reader();
		
		long t=scan.nextLong();
		int n;
		long painpow;
		int []solip;;
		for(int i=0;i<t;i++)
		{
			n=scan.nextInt();
			
			painpow=scan.nextLong();
			solip=new int[n];
			
			for(int j=0;j<n;j++)
			{
				solip[j]=scan.nextInt();
				
			}
		int ans=think(painpow,solip);
		if(ans==0)
		{
			
			System.out.println("Evacuate");
		}
		else
		{
			System.out.println(ans);
			
		}
			
		}
		
		
		
		
	
	
	
	}







}

