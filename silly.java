package competitive_programming;

public class silly {
	private static void sillynewton(int N) 
	{
		int nat=1;
		int sum=0; 
		while(true)
		{
		
		
		if((sum+(nat*nat))<=N)
		{
			
		sum+=(nat*nat);
		nat+=1;
		}
		else
		{
			break;
		}
		}
		int temp=sum+((nat+1)*(nat+1));
		if((temp-N)<sum-N)
		{
			return temp;
			
		}
		else
		{
			return sum;
		}
		System.out.println( sum);
	}
	

	public static void main(String[] args) {
		
		sillynewton(100000);
	}



}
