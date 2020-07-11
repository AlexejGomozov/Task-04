package by.htp.decomposition.logic;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника.
   Написать метод(методы) вычисления его площади, если угол 
   между сторонами длиной X и Y— прямой.
    The numbers X, Y, Z, and T are the lengths of the sides of the quadrilateral.
    Write a method (s) for calculating its area if the angle
    there is a straight line between the sides of length X and Y.*/

public class Task12 {
public static void task() {
		
	int s = s1(20,10) + s2(15,12);
	                             System.out.println(s);
}
    public static int s1 (int X, int Y) {
    	
    	int S1 = (X*Y)/2;                                           // площадь прямоугольного треугольника образованного после проведения диагонали.
    	
    	 return S1;  	
    }   
        public static int s2 (int Z, int T) {
    	
    	int C = (int)Math.sqrt((Math.pow(Z, 2) + Math.pow(T, 2)));  //C  - это диагональ, чтоб образовался прямоугольный треугольник с гипотенузой С
    	int p = (Z + T +C)/2;                                       //полупериметр треугольника
    	int S2 = (int)Math.sqrt(p*(p - Z)*(p - T)*(p - C));         //площадь треугольника через полупериметр треугольника 
    	
    	 return S2; 	
        }    
}
