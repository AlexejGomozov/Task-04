package by.htp.decomposition.logic;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
//  НОК(А,В) = A*B / НОД(А,В);
public class Task02 {
	public static void task() {
		int x, y;
		x = 125;
		y = 428;

		mn(x, y);
	}

	public static int mn(int x, int y) {
		int m, n;
		n = 1;
		m = 1;
		int y1 = 0;
		int x1 = 0;
		int count = 0;
		int count1 = 0;
		int s = 0;
		int k = 0;
		int c = 1;                        // все оставляю, не убираю лишние .... ;)
		int h = 1;                      ///очень много переменных], чтобы одно конкретное значение действовало только в нужной области
		int nod = 1;
		int nok = 1;
		int z = 1;
		int r = 1;
		int l = 1;

		for (int v = 1; v <= y; v++) { // for (int i = 1, j = 1; (i <= x) | (j <= y); j++, i++) {

			h = y; // присваию значение ,y, другой переменной чтобы действия со значением ,y,
					// указанные в самом начале, были доступны для других операций             ///здесь хотел фором начиная с 1 отделить
			while (h % v == 0) {                                                              /// "1" от общей части поиска делителей,
 				count++;                                                                    ///определив при этом простое ли это число
				n = h / v;
				h = n;
				System.out.println(count + ", " + v);
				if ((count + 2) > 2)
					break;
			}

		}

		int h2 = x;
		int h1 = y;
		for (int i = 2, j = 2; (i <= x) | (j <= y); j++, i++) {
			
			while (h1 % j == 0) {
				s = j;
				l = l * s;                                                                  // присваиваю значение ,y, другой переменной
				System.out.println("     y = " + h1 + ", s = " + s + ", l = " + l + ";"); // чтобы действия со значением
																							// ,y, указанные
																							// в самом начале были
																							// доступны для других
																							// операций
				m = h1 / s;
				h1 = m;
			}

			while (h2 % i == 0) {
				k = i;
				r = r * k;
				System.out.println("x = " + h2 + ", k = " + k + ", r = " + r + ";");

				n = h2 / k;
				h2 = n;
				
			}

			if ((k == s) & (s == j)) {
				nod = s * nod;                                      /// если ни одно k не равняется ни одному s, то nod = 1 , как задано
				System.out.println("Наибольший общий делитель = " + nod);
			}
			                                             // !! исправил (добавив (s==j)!! не понятно откуда взялась вторая тройка должно быть 2 и 3 и
				                                         // все ...и в итоге наименьшее общий делитель 6.
		}
		
		if (x > y) {
			nok = r * ((l / nod));
			System.out.println( "l = " + l + ". Наибольший общий делитель = " + nod +  ". Наименьшее общее кратное = " + nok + "; ");
		} else {
			nok = l * ((r / nod));
			System.out.println("r = " + r + ". Наибольший общий делитель = " + nod +  ". Наименьшее общее кратное = " + nok + "; ");
		}

		if ((k != s) & (s != y)) {                              //здесь находим нод и нок, если одно или оба числа простые 

		} else if (y % x == 0) {
			nod = x;
			nok = y;
			System.out.println("Наибольший общий делитель = " + nod + "; Наименьшее общее кратное = " + nok + "; ");
		} else if (x % y == 0) {
			nod = y;
			nok = x;
			System.out.println("Наибольший общий делитель = " + nod + "; Наименьшее общее кратное = " + nok + "; ");
		} else if ((y % x != 0) & (x % y != 0)) {
			nod = 1;
			nok = x * y;
			System.out.println("Наибольший общий делитель = " + nod + "; Наименьшее общее кратное = " + nok + "; ");
		}

		return c;
	}
}
