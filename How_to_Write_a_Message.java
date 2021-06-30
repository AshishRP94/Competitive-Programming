package competitive_programming;



import java.util.ArrayList;
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





public class How_to_Write_a_Message 
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
	
	
	
	//The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
	//
	//The first line of each test case contains two integers N and M.
	//
	//The second line contains the string X and the third line contains the string Y, both of length M.
	
	static ArrayList<String>block=new ArrayList<String>();
	
	private static int permute(int n, int m, char[] str1, char[] str2, int ind, int j)
	{
		char[] temp1=new char[25];
	    char[] temp2=new char[25];
		if(ind==m)
		{
			
			return 0;
		
		}
		
		
		if(j==m-1)
		{
			j=0;
			ind=ind+1;
			return 0;
		}
		
		if(ind<j)
		{
			int ascii1=0;
			int ascii2=0;

			for(int i=0;i<str1.length;i++)
			{
				
				
				temp1[i]=str1[i];
				temp2[i]=str2[i];
			}
			
			ascii1=((int)temp1[j+1])-((int)('a'));
			ascii2=((int)str1[ind])-((int)('a'));
			if(ascii1<)
			{
				
			}
			temp1[ind]=temp1[j+1];
			temp2[ind]=temp2[j+1];
		    block.add(temp1.toString());
		    block.add(temp2.toString());
		    findpossiblewords(n,m,str1,str2,ind,j+1);
	
		}
		
		return 0;
		

	}

	private static int findpossiblewords(int n, int m, char[] str1, char[] str2, int ind, int j) 
	{
		for(int i=0;i<m;i++)
		{
			
			
		}
				
		return 0;
	}

	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan=new Reader();
		int t=scan.nextInt();
		String x,y;
		int n=0,m=0;
		for(int i=0;i<t;i++)
		{
			
			n=scan.nextInt();
			m=scan.nextInt();
			scan.readLine();
			x=scan.readLine();
			y=scan.readLine();
			int ind=0;
			int j=0;
			System.out.println(findpossiblewords(n,m,x.toCharArray(),y.toCharArray(),ind,j));
		
		
		}
		
	}



	






}










