package by.htp.decomposition.logic;
import java.util.Arrays;
import java.util.Scanner;
/* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
  Write a program that determines the sum of n - digit numbers containing only odd digits. Also determine 
  how many even digits are in the found amount. To solve the problem, use decomposition. */

                                      public class Task19 {


                                 public static int [] oddNumb (int x) {                 //находим массив случайных чисел с количеством ячеек "x"
		                                                                       
	                          int [] arrayOddNumb = new int[x];
	
	                       for( int i = 0; i< x; i++) {
		
		                arrayOddNumb[i] =(int) (Math.random()*10) ;
		
		             if(arrayOddNumb[i]%2 == 0 | arrayOddNumb[i] == 0) arrayOddNumb[i] = arrayOddNumb[i] + 1;  //определяем, чтобы эти числа не были равны "0" и четным цифрам
				
	               }
	             return arrayOddNumb;
               }
                 public static int figureOdd (int [] x) {                          //из массива выводим одно число, объеденив ячейки через String
		
	                String sumString = ""; //null;
	              
	                   for(int variable: x ){
	                	
		                  sumString  = sumString + ( variable);	
                            }
	                         int sum = Integer.parseInt(sumString);                   //полученное число из String переводим в int
	
	                            return sum;
                                 }
                                 public static int evenNumb( int y) {                 //определяем сколько четных цифр в полученной сумме, для этого проверяем каждую цифру
	
	                           String StringY = String.valueOf(y);
	                           
	                         int evenN = 0;
	
	                       int count = 0;
	
	                    for (int i = 1; i <=StringY.length(); i++) {
		
		             evenN = y % 10;  
		             
		          if (evenN % 2 == 0 & evenN != 0)   count ++;              
		          
		        y = y/10;
	          }	                    
	        return count;
          }
          public static void task() {
	
	        int n, m, c, v;
	
	          System.out.print("Для решения данной задачи n-значное число может быть от 2 до 9.\n " +
	           "Введите число для определения n - значных чисел >> ");
	
	             Scanner sc = new Scanner(System.in);
	             
	               v = sc.nextInt();
	
	                System.out.println("v = " + v);
	
                      n = figureOdd (oddNumb (v));
	
	                    m = figureOdd (oddNumb (v));
	
	                      c = n + m; 
	
	                        System.out.println("Два числа, содержащие нечетные цифры :" + n + ", "+ m);
	
	                          System.out.println("Сумма двух нечетных чисел  = "+ c + ". Количество четных цифр в сумме данных чисел = " + evenNumb(c));

	                            sc.close();
                                  }
                                    }