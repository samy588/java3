package dd;

public class dd {
	public static void main(String args[])
	{
	int n,i;
	n=f(8);
	System.out.println(n);
	}
	public   static int f(int x)
	{
		if(x!=0)
		{
			return x+f(x-1);
			
			
		}
		else 
			return x;
		//forgot the function name
		System.out.println();
		}
		
	}


