package by.htp.decomposition.logic;

/* Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма
   его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 
   до k. Для решения задачи использовать декомпозицию.
     A natural number in which there are n digits is called an Armstrong number if the sum of
     its digits raised to the power of n is equal to the number itself. Find all Armstrong 
     numbers from 1 to k. To solve the problem, use decomposition.  */

public class Task17 {
	
      public static int raschet (int x) {
	
         String xStr = String.valueOf(x);

               int numbArmstr = 0;
      
                  for (int j = 0; j<xStr.length(); j++) {       //xStr.length() - степень числа
    	 
	                  int x1 = (x % 10);
                          x= x/10;
                
                              numbArmstr = (int)Math.pow(x1, xStr.length()) + numbArmstr;           
                  }   
                                     return numbArmstr;
       }
      
                public static void task() {
                   int k;
                   
                       k = 2000;   
   
                           for (int i = 1; i<= k; i ++) {
	   
                               if (i == raschet(i))   System.out.println(i + " - это число Армстронга");
  
                            }
                }
}