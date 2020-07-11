package by.htp.decomposition.logic;
import java.util.Arrays;
import java.util.Scanner;
/* Задан массив D. Определить следующие суммы:
   D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
   Пояснение. Составить метод(методы) для вычисления суммы
   трех последовательно расположенных элементов массива с номерами от k до m.  
        An array D is specified. Define the following amounts:
	    D [1] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6].
	    Explanation. Create a method (methods) for calculating the amount
	    three consecutive array elements with numbers from k to m. */
	  
public class Task11 {
public static void task() {
	
	int [] D = new int [10];                       //{D[0],D[1],D[2],D[3],D[4],D[5],D[6],D[7],D[8]};
	for( int i =0; i<D.length; i++) {
				
		D[i] = (int)(Math.random()*100 + 1);
	}				
	    System.out.println(Arrays.toString(D));
		
	 System.out.println(sumThree (D));   
	 
}
     public static int sumThree (int []D) {
	      int sum  = 0;
	      System.out.println ("Enter a number within the length of array D ");
	      
     Scanner sc = new Scanner(System.in);
	     int x = sc.nextInt();                 
	     System.out.println ("" + x);
	     
	     if((x>=(D.length-3)) & (x < D.length)) sum = D[D.length-1] + D[D.length-2] + D[D.length-3]; //если введенное число меньше 3х последних длинны массива, то производим сумму трех последних значений массаива
	     else {for( int i = x; i < (x+3); i++)                                                       // или считаем сумму 3х значений после введенного (включительно) значения массива
	           sum  = sum + D[i];}
		                                   
     sc.close();	                                
			
	 return    sum ;
     }
}
