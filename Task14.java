package by.htp.decomposition.logic;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task14 {
public static void task() {
	int x;
	int y;
	
	x = (int)(Math.random()*100000 + 1);
	y = (int)(Math.random()*100000 + 1);
	
	System.out.println("x = " + x + "; y = " + y);
	System.out.print("Больше цифр в числе : " + comparison(x, y));
}
public static int comparison (int a, int b) {
	
	 String a1 = String.valueOf(a);
	 String b1 = String.valueOf(b);
	 
	 int a2 = a1.length();
	 int b2 = b1.length();
	 int max;
	 
	 if ( a2 > b2) max = a;
	  else  if (a2 == b2) max = 0;
	 else max = b;
	 
	 return (max);
}
}
