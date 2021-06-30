package competitive_programming;




//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first line of each test case contains a single integer N.
//The second line contains N space-separated integers S1,S2,…,SN


import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 





public class Stupid_Machine 
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
	

	private static long  findmax(long[] capacity) 
	{
		boolean flag=false;
		long max=Integer.MIN_VALUE;
		int ind=0;
		for(int i=0;i<capacity.length;i++)
		{
//			System.out.print(""+(capacity[i])+"|");
//			System.out.print("i="+i+"|");
			if(capacity[i]==0)
			{
				if(flag==false)
				{
					max=0;
				}
				break;
			}
			if(max<=capacity[i])
			{
				flag=true;
				max=capacity[i];
				ind=i;
//				System.out.print("max="+max+"|");				
			}
			
		}
//		System.out.println();
		
		return ind;
		
		
	}
	
	private static long findmaxtokens(int n, long[] capacity) 
	{
		
		long tokens=0;
		for(int j=0;j<capacity.length;j++)
		{
			long maxind=findmax(capacity);
//			System.out.println("maxind"+maxind);
			if(capacity[0]==0)
			{
//				System.out.println("end");
				break;
			}
			
			for(int i=0;i<=maxind;i++)
			{
//				System.out.println("i"+i);
				capacity[i]-=1;
				tokens=tokens+1;
//				System.out.println("tokens"+tokens);
			}
		}

		
		  return tokens;
		
	}
	

	public static void main(String[] args) throws java.lang.Exception
	{
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		Reader scan=new Reader();
		int t=scan.nextInt();
		int n=0;
		for(int i=0;i<t;i++)
		{
			n=scan.nextInt();
			long[] capacity= new long[n];
			for(int j=0;j<capacity.length;j++)
			{
				capacity[j]=scan.nextLong();
			}
			System.out.println((findmaxtokens(n,capacity)));
			
			
		
		
		
		}
	
	
	
	}

	

}
