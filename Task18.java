package by.htp.decomposition.logic;
import java.util.Scanner;
/* Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую 
   последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
      Find all natural n-digit numbers whose digits form a strictly increasing sequence 
      (for example, 1234, 5789). To solve the problem, use decomposition.  */

       public class Task18 {
	
          public static int sequence (int x) {
    	   
	         int y=0;
	      
               for(int i = 1; i<=10-x; i ++) {
	  
	             for ( y = i; y< i + x; y++) {
	
	               System.out.print(y) ;      
	          	                                                                    
	             }	
	                   System.out.print( "; ") ;  	         
} 
                           return y;
}
                               public static void task() {
                                	
                            Scanner sc = new Scanner(System.in);
	                     System.out.println();
	                      	            	                   
	                System.out.print("Для решения данной задачи n-значное число может быть от 2 до 9.\n " + 
	            "Для нахождения чисел с возрастающей последовательностью, \n"
	        + "введите n-значное число:   >> ");
	     int a = sc.nextInt();
	     
	  System.out.println("a = " + a);

         sequence (a);

            sc.close();
}
}