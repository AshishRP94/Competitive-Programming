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




public class Jerry_Cheese
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

	static long min=Integer.MAX_VALUE;
	static long max=Integer.MIN_VALUE;
	static long tca=0; 
	private static long sum(long[] calorie, int i) 
	{		
		if(i==calorie.length-1)
		{
			if(calorie[i]<min)
			{
				min=calorie[i];
			}
			else
			{
				max=calorie[i];	
			}
			return calorie[i];
		}
		

		if(i<calorie.length)
		{
		
		
		if(calorie[i]<min)
		{
			min=calorie[i];
		}
		else
		{
			max=calorie[i];	
		}
		 tca=tca+calorie[i]+sum(calorie,i+1);
		}
		
		return tca;
		

		
		
	}
	
	
	private static String ans(long d, long[] calorie, int i) 
	{
		if(i<calorie.length)
		{
		
		if(calorie[i]==d)
		{
			System.out.println("no");
			return"NO";
		}
		String s=ans(d,calorie,i+1);
		if(s=="NO")
		{
			System.out.println("nooo");

			return "NO";
		}
		}
		
		return "YES";
	}
//	4 15
//	3 5 2 1



	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan=new Reader();
		
		long n=scan.nextLong();
		long tcalorie=scan.nextLong();
		long []calorie=new long[(int)n];
		
		for(int i=0;i<calorie.length;i++)
		{
			calorie[i]=scan.nextLong();
		}
		int i=0;
//		long sum=0;
		long s=sum(calorie,i);
		System.out.println("s="+s);
		long d=Math.abs(tcalorie-s);
		System.out.println("d="+d);
//	System.out.println("su="+su);
		
		
		
		
		System.out.println("min="+min+"|max="+max);
		if(d==0)
		{
			System.out.println("NO");

		}
		else if(min<=d && d<=max)
		{
			
			System.out.println(ans(d,calorie,i));
		}
		else
		{
			System.out.println("NO");

		}
		
		
		
		
		
		
	
	
	
	}





//	3 10
//	1 2 4


}
