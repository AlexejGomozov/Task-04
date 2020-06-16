package by.htp.decomposition.logic;

//Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел. 

public class Task04 {
	public static void task() {

		int a, b, c;
		a = 23;
		b = 8917;                              //not done yet
		c = 27923;

		naim(a, b, c); 
		
	}                 //должно вывести: ......   наименьший общий кратный 5726755993
                //а вот что у меня ...   a = 27923, b = 8917, c = 23. nod_ac = 1, nod_ab = 1. Наименьший общий кратный 1431788697

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
	                	System.out.println("a = "+a + ", b = "+ b + ", c = "+ c);       
	                	
		int nod_cb = c;
		
		for( int i = 2; i <= c; i ++) {	
		    if(c % i == 0 && b % i == 0)
			{   nod_cb = i;
				System.out.println("nod_cb = "+nod_cb);             				
			}  else {nod_cb = 1; System.out.println("nod_cb = "+nod_cb); }
		}	
		
		int nod_ab = b;
		
           for (int j = 2; j <= b; j++) {
		    if(b % j == 0 && a % j == 0)
		    {   nod_ab = j;
			    System.out.println("nod_ab = "+nod_ab);                  
		    } else {nod_ab = 1; System.out.println("nod_ab = "+nod_ab); }
		}	
		
		 int nod_ac = c;                       
			
		 for (int h = 2; h <= c; h ++) {
		    if(c % h == 0 && a % h == 0)
			{    nod_ac = h;
				System.out.println("nod_ac = "+nod_ac);              
			}   else {nod_ac = 1; System.out.println("nod_ac = "+nod_ac); }
		 } 
			
			if (nod_ac % nod_cb == 0)  {g = a * (b/nod_ab) * (c/nod_ac); ; System.out.println("a = "+ a + ", b = "+b+", c = "+c+". nod_ac = " + nod_ac + ", nod_ab = "+ nod_ab + ". Наименьший общий кратный " + g);
			} else {g = (a * (b/nod_ab)) * ((c/nod_ac)/nod_cb) ; System.out.println("///наименьший общий кратный " + g);
				
			}
		
		return g;
	}
	
	}
