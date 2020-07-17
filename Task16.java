package by.htp.decomposition.logic;
import java.util.Arrays;
/*Два простых числа называются «близнецами», если они отличаются друг от друга 
на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n],
где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
    Two primes are called "twins" if they differ from each other by 2 (for example, 41 and 43).
    Find and print all pairs of “twins” from the segment [n, 2n], where n is a given positive 
    integer greater than 2. Use a decomposition to solve the problem.*/

public class Task16 {
 	
	public static String [] twins (int x) {     
	
	        String [] result = new String [x - 1];               //количество ячеек массива, количество пар близнецов 
			
			for (int i = 0; i<=(x-2) ; i++) {                    //количество пар в данном диапазоне меньше (или равно) на пару от верхней границы	
				
			result [i] = (String.valueOf(x + i) + ", " + String.valueOf(x + 2 + i)); 
			      
				System.out.println(result [i]);
		}
	return result;
	}	

     public static void task() {
	       
    	 int a = 20;
	
    	 twins (a); 
    }
}