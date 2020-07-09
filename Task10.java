package by.htp.decomposition.logic;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
//Write a method (s) for calculating the sum of factorials of all odd numbers from 1 to 9.
  public class Task10 {
  public static void task() {
	
	System.out.println(sumFuc(9));
  }
      public static int sumFuc(int x) {
	
	  if (x <= 1) return 1;
	
      return  fuctorial(x)+ sumFuc(x - 2);   
		
      }
           public static int fuctorial(int x) {
 
	       if (x <= 1) return 1;
	
	       return x*fuctorial(x - 1);
           }
   }   