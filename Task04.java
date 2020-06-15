package by.htp.decomposition.logic;

//Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел. 

public class Task04 {
	public static void task() {

		int a, b, c;
		a = 138;
		b = 456;
		c = 48;

		naim(a, b, c); 
		
	}

	public static int naim(int a, int b, int c) {
		
		  int g;
		  int t, k, p;
		  
		// определяю наибольшее и наименьшее число из 3х
		if (a < b) {
			t = a;
			a = b;
			b = t;
		}
		if (c > a) {
			k = a;
			a = c;
			c = k;
		}
		if (c > b) {
			p = c;
			c = b;
			b = p;
		}
		int nod_cb = c;
		
		for(; nod_cb > 1; nod_cb --) {	
		    if(c % nod_cb == 0 && b % nod_cb == 0)
			{
				System.out.println("nod_cb = "+nod_cb);             				
			}
		}
		
		int nod_ab = b;
		
		for (; nod_ab > 1; nod_ab--) {
		    if(b % nod_ab == 0 && a % nod_ab == 0)
		    {
			    System.out.println("nod_ab = "+nod_ab);                  
		    }
		}
		
		 int nod_ac = c;
			
		 for (; nod_ac>1; nod_ac--) {
		    if(c % nod_ac == 0 && a % nod_ac == 0)
			{
				System.out.println("nod_ac = "+nod_ac);              
			}  
		 } 
			
			if (nod_ac % nod_cb == 0) {g = (a * (b/nod_ab)) * (c/nod_ac) ; System.out.println("наименьший общий кратный " + g);
			} else {g = (a * (b/nod_ab)) * ((c/nod_ac)/nod_cb) ; System.out.println("///наименьший общий кратный " + g);
				
			}
		
		return g;
	}
	
	}
