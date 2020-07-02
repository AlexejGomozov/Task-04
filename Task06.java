package by.htp.decomposition.logic;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
//Calculate the area of a regular hexagon with side "a" using the method of calculating the area of a triangle.
//S = 3√3/2*a^2;
public class Task06 {
public static void task() {
	double a = 5;
	
	System.out.print("Area of a regular hexagon with side \"a\" " + Sshest(a));
}
public static double  Sshest(double  a) {
	
	return (3*Math.sqrt(3))/2 * Math.pow(a, 2);
}
}