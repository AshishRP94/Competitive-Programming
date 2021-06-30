package competitive_programming;

import java.util.Scanner;
import java.util.Stack;
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





public class cookoff3 
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

	private static void findselfdestson(String s) 
	{
		int count=0;
		boolean flag=false;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.length()==1)
			{
				if(s.charAt(i)=='1')
				{
					flag=true;
					break;
				}
			}
			
			if(((Integer.parseInt(s,2)|0)==0))
			{
				
				flag=false;
			}
			
			for(int j=0;j<s.length()-1;j++)
			{
				if(s.length()==1)
				{
					if(s.charAt(j)=='1')
					{
						break;
					}
				}
					
				if(s.charAt(j)!=s.charAt(j+1))
				{
					String temp1=s.substring(0,j);
					String temp2=s.substring(j+1,s.length());
					s="";
					s=temp1+temp2;
					count+=1;
				}
				else if(s.charAt(j)=='1' && s.charAt(j+1)=='1')
				{
					String temp1=s.substring(0,j);
					String temp2=s.substring(j+1,s.length());
					s="";
					s=temp1+temp2;
					count+=1;
					
				}
				if(s.length()==0)
				{
					break;
				}
				
				
				
			}
			if(s.length()==0)
			{
				break;
			}
			
		}
		if(flag==false)
		{
			
			System.out.println("-1");
		}
		else
		{
			System.out.println(count);
			
			
		}
	
	}



	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in); 
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			scan.nextLine();
			String s=scan.nextLine();
			findselfdestson(s);
			
		}
		
			
		
		
		
		


		
	
	
	
	}








}




