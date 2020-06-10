package by.htp.decomposition.logic;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task03 {
	public static void task() {
		int x,  y,  h,  g;
		 x = 426;
		 y = 1122;
		 h = 564; 
		 g = 84;
		
		 number (x, y, h, g);
	}	
	
	public static int number (int x, int y, int h, int g) {
		int m, n, s, d;
		m = 1;
		n = 1;
		s = 1;
		d = 1;
		int q, w, e, r;
		q = 0;
		w = 0;
		e = 0;
		r = 0;
		int c1, c2;
		c1 = 1;
		c2 = 1;
		
		for (int j = 2, i = 2;  (j<=x) | (i<=y) ; j++, i++) {
			
			while (x%j==0) {
				q = j;
				m = x/q;
				x = m;			                                          
				System.out.println(". x = " + x +  ", q = "+ q);			
			}
			while (y%i==0) {
				w = i;
				n = y/w;
				y = n;
				
				System.out.println(". y = " + y +  ", w = "+ w);			                 
		    }
		
		                   if ((q == w)&(w==j)) {                 //(w==j очень помогло чтобы С1 не растила херню с каждым шагом for
                            c1 = c1 * q;                         // сделать так в двух вайл а потом сравнить отдельно эти два
                               System.out.println("c1 = "+ c1);
                           }	
		}	
			
		for ( int k = 2, l = 2;(k<=h) | (l<=g); k++, l++) {
			
			while (h%k==0) {
				e = k;
				s = h/e;
				h = s;
				System.out.println(". h = " + h +  ", e = "+ e);			
	        }
			while (g%l==0) {
				r = l;
				d = g/r;
				g = d;
				System.out.println( ". g = " + g +  ", r = "+ r);
			}	
			if ( (e == r)&(r==k)  ) {
	            c2 = c2 * e;                                    // сделать так в двух вайл а потом сравнить отдельно эти два
	             System.out.println("c2 = "+ c2);
	        }					
					
		}
		            //нашли делители одной двойки чисел и нашли делители второй двойки чисел. 
		            //Теперь сравнить эти делители на нахождение общих делителей
		
		if (c1==c2) { System.out.println ("Наибольший общий делитель = ----" + c1 );
		} else if (c1%c2==0) { System.out.println("Наибольший общий делитель = ----" + c2 );
		} else if (c2%c1==0) {System.out.println("Наибольший общий делитель = ----" + c1 );
		}
          	
		return m;
 }
}