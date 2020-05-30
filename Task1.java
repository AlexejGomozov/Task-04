package by.htp.decomposition.logic;

//Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

public class Task1 {
public static void task() {
	int x1, x2, x3, y1, y2, y3;
	
	 x1 = 1; y1 = 2;
	 x2 = 2; y2 = 8;
	 x3 = 3; y3 = 3;
	
	double S = area(x1, y1, x2, y2, x3, y3);           
	
	System.out.print("Площадь треугольники равна " + S + ";");
}

	public static double area(int a1, int b1, int a2, int b2, int a3, int b3) {

		double area;

		area = Math.abs((a2 - a1) * (b3 - b1) - (a3 - a1) * (b2 - b1)) / 2;

		return area;

	}

}
