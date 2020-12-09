package by.htp.decomposition.logic;

import java.util.Arrays;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не 
большее N.
    The natural numbers K and N are given. Write a method (methods) of forming
    an array A whose elements are numbers whose sum of digits is equal to K and 
    which are not greater than N. */

  public class Task15 {
  public static void task() {
	int K;
	int N;
	
	K = 883567;
	N = 4534;
	        System.out.println(sumA(arrayB(K, N)));
}
  public static int sumA(int[] A) {
                int sum = 0;
                for(int value : A) {
                sum += value;
               }
                return sum;
   }
        static int []  arrayB (int x, int y) {                        
	   
	         int [] B = new int [(x/y)+2];                     // длинну массива определил величиной (x/y) + 2 ячейки - (двойка, а просто так :) ), чтобы (last) число вероятнее всего было меньше "y")
	   	  
	         int sum1 = 0;
	         
	         for(int i = 0; i<=((x/y)+2)-2; i ++) {
		   
		     B[i] = (int)(Math.random()*y+ 1);                 //генерируем число в пределах до числа "y" (включительно);
		  
		     sum1 = sum1 + B[i]; 
		    
		     System.out.println("B" + i+ " = " +B[i]);
	         }
	           B[((x/y)+2)-1] = x - sum1;                      //считаем последнюю ячейку массива 
	   
	          System.out.println("B[last]  = " + B[(x/y)-1]);
	          
	         if (B[((x/y)+2)-1] > y) return arrayB(x,y);       // если последнее число больше "y", возвращаем метод на подбор других значений
	        
	          return B; 
        }
}
