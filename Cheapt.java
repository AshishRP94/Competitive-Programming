package competitive_programming;




import java.util.Scanner;

public class Cheapt {
		//sol is wrong
	public static void main(String args[])
	{
		System.out.println("abc");
		int ntr;
		int nstm;
		int cstm;
		int p;
		Scanner scan =new Scanner(System.in);
		ntr=scan.nextInt();
		nstm=scan.nextInt();
		cstm=scan.nextInt();
		p=scan.nextInt();
     	int tp=0;
    	if(cstm>=p)
    	  {
    		int t,m;
    		t=ntr/nstm;
    		m=ntr%nstm;
    		tp=t*cstm;
    		ntr=ntr-(nstm*t);
    		if(m<nstm)
    		{
    			tp=ntr*p;
    				
    		}
    		}
    		else
    		{
    		
    			tp=ntr*p;
    		}
    	System.out.println(tp);
    	

    		
    		
    		
    		
    		
    		
    
    		
    	

		
		
	}

}
