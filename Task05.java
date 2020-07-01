package by.htp.decomposition.logic;
//Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
//Write a method (s) to find the sum of the larger and smaller of the three numbers.


public class Task05 {
	public static void main(String[]args) {
	int a = 123; 
	int b = 76; 
	int c = 89; 
	
    System.out.print("Sum of the larger and smaller of the three numbers. " + sum(a,b,c));
	}
	public static int sum (int a, int b, int c) {
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
			 return a + c; 
	}
}
