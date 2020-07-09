package by.htp.decomposition.logic;


//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
//Write a method(s) that checks whether the given three numbers are mutually Prime.
public class Task09 
	 
	
	{
	    public static int gcd(int n, int m) 
	    {
	    	  if (m > n) return gcd(m, n);      
	    	if (m==0) return n;
	    return gcd(m,n%m);           
	    }
	 
	    public static boolean isVprime(int k, int l, int c)
	    {
	    	return (gcd(k, l)==1) & (gcd(k, c)==1) & (gcd(l, c)==1);
	    }
	 
		public static void main (String[] args)        
		{
			int x = (int)(Math.random()*100 +1);
			int y = (int)(Math.random()*100 +1);
			int h = (int)(Math.random()*100 +1);
			int f = (int)(Math.random()*100 +1);
			int d = (int)(Math.random()*100 +1);
			int s = (int)(Math.random()*100 +1);
			
			System.out.println( x+ ", " + y + ", " +  h + " - "  + isVprime(x, y, h));
			System.out.println(f+ ", " + d + ", " +  s + " - "  +  isVprime(f, d, s));
		}
	}