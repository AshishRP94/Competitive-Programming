package competitive_programming;

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
import java.math.BigInteger;




public class Circle_of_Chaos 
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
	

//	The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//	The first line of each test case contains two space-separated integers N and M.
//	The second line contains M space-separated integers p1,p2,…,pM.
	  public static int gcd(int a, int b) 
	    { 
	        if (a == 0) 
	            return b; 
	          
	        return gcd(b%a, a); 
	    } 
	  
	private static void killsorcerer(int n, int m, int[] spell) 
	{
//		System.out.println("hiiii");
		int gcd=spell[0];
		for(int i=0;i<m;i++)
		{
			gcd=gcd(gcd,(spell[i]));
		}
		if(gcd>n)
		{
			int factor=maxfact(gcd,n);
			gcd=factor;
		}
		
		System.out.println(n-gcd);
	
	
	}








	private static int maxfact(int gcd, int n) 
	{		 
		int max=0;
	
	    int i = 2; 
	   
	    int k =(int) Math.ceil(Math.sqrt(gcd)); 
	  
	    // While loop till the 
	    // square root of N 
	   for(i=2;i<=k;i++)
	   {
	     
	        if(gcd % i == 0)
	        {
	        	if(i<n)
	        	{
	        		max=max(max,i);
	        	}
	        	
	        	if(gcd/i<=n)
	        	{
	        		max=max(max,gcd/i);
	        		        	
	        	
	        	}
	        		
	        }
	       
	    }
	        	 
	   
	     
	  
	    // If none of the numbers is a factor, 
	    // then it is a prime number 
	    return max;
	
	}








	private static int max(int m, int i) 
	{
		if(i>m)
		{
			return i;
		}
		else
		{
			return m;
		}
	}
		
		
	
		
	
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan=new Reader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int []spell=new int[m];
			for(int j=0;j<m;j++)
			{
				spell[j]=scan.nextInt();
			}
			killsorcerer(n,m,spell);
			
		}
	}




	}













