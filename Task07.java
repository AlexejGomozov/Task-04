package by.htp.decomposition.logic;

/*На плоскости заданы своими координатами n точек. Написать метод(методы),
  определяющие, между какими из пар точек самое большое расстояние. Указание.
  Координаты точек занести в массив.
  There are n points on the plane with their own coordinates. Write a method (s),
  determining which pairs of points have the largest distance between them. Instruction.
  Enter the coordinates of the points in the array.
*/

public class Task07 {

	public static double [] x;
	public static double [] y;
	
	void res (double []x, double []y){
	
	     x = new double [3];
		 y = new double [3];
		
		 for (int i = 0; i<3; i++) {
			x [i] = Math.floor(Math.random()*10 +1);
			y [i] = Math.floor(Math.random()*10 +1);
		
		    System.out.println("x" + (i + 1) + " = " + x[i] + " y" + (i+1)+" = "+y[i]);
	     }
				
	     double [] result = new double [3];
		 
	      for( int i =0; i<3; i++) {
		        result[i] = Math.sqrt((Math.pow(x[i] - x[result.length-1], 2)) + (Math.pow(y[i] - y[result.length-1],2)));
		        System.out.println("Distance = " + result[i]);
	      }	
	 m(result);           
	}
	
	public static double m(double [] result) {
			
	     double max = result[0];
	     
	     for(int j = 1; j<result.length; j++) 
	    	 
		 max = Math.max(result[j], max);
	
	     System.out.println("The Maximum value is : " + max);
	return max;
    }
		
	public static void task() {
		Task07 an = new Task07();
		an.res (x, y);  
	}}
	
	
	

/*
Math.random() generates a number between 0 and 1. We 
then multiply this by 10 to give us a number in the 
range 0 to 9.999999999.
So in Math.floor( (Math.random() * 10) + 1); multiplying Math.random() 
by 10 will provide a random number from [0, 10).

The +1 after the multiplication will change the output to be [1, 11).
Then finally Math.floor( ... ) converts the random number that is in 
the range from [1, 11) to an integer value.

So the range of the executed statement will be all integers from [1, 10].
 Or to be more specific it will be one of the numbers in this set: 
 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
*/