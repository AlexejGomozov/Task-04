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
		int q, w, e, z, z1, z2, g;
		q = 0;
		w = 0;
		e = 0;
		z = 1;
		z1 = 1;
		z2 = 1;
		int m, n, l;

		int t, k, p, p1;

		int a1, b1, c1;
		// определяю наибольшее число из 3х
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

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);

		for (int i = 2; i <= a; i++) {

			// a1 = a;
			while (a % i == 0) {
				q = i;
				m = a / q;
				a = m;
				System.out.println("Делитель числа a = " + a + ", q = " + q);
			}

		}

		for (int j = 2; j <= b; j++) {

			// b1 = b;
			while (b % j == 0) {
				w = j;
				n = b / w;
				b = n;
				System.out.println("Делитель числа b = " + b + ", w = " + w);
			}
		}

		for (int h = 2; h <= c; h++) {
			// c1 = c;
			while (c % h == 0) {
				e = h;
				l = c / e;
				c = l;
				System.out.println("Делитель числа c = " + c + ", e = " + e);
			}

		}
		// if (e==w) {z = z * e; System.out.println("общий делитель b и c "+ z);}
		// if ((q != w)) {z1 = z1 * q; System.out.println("общий делитель a, b и c "+
		// z1);} //(q == e) &
		// if ((q != e)) {z2 = z2 * q; System.out.println("общий делитель a, b и c "+
		// z2);}
		// else System.out.println("общий делитель a, b и c "+ 1);

		/*
		 * if (e!=w) { z = z * e; z1 = z1 * w; System.out.println("z = "+ z + ", z1 = "+
		 * z1);}
		 */

		// if (e==w) {z = z * e; System.out.println("общий делитель b и c "+ z);}

		g = (a * b * c) / z;
		System.out.println("наименьший общий кратный " + g);
		return c;
	}
}
