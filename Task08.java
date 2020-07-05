package by.htp.decomposition.logic;
import java.util.Arrays;
/*   Составить программу, которая в массиве A[N] находит второе по
    величине число (вывести на печать число, которое меньше 
    максимального элемента массива, но больше всех других элементов).
 Create a program that finds the second in the array A[N]
the largest number (print a number that is less than
the maximum element of the array, but more than all other elements).*/

public class Task08 {
	public static void task() {
		
		  int [] s = {12, 5, 45, 786, 11, 3, 14, 16, 7};
		  System.out.println(max(c(s)));
	}		
	
		  public static int[] c(int[]mas) {
			 
		  boolean isSorted = false;
		        int buf;
		        while(!isSorted) {
		            isSorted = true;
		            for (int i = 0; i < mas.length-1; i++) {
		                if(mas[i] > mas[i+1]){
		                    isSorted = false;
		 
		                    buf = mas[i];
		                    mas[i] = mas[i+1];
		                    mas[i+1] = buf;
		                }
		            }
		        }
		        System.out.println(Arrays.toString(mas));
		        return mas;
		   }
		  
		     public static int max (int[]x){
			        int max = x[x.length-2];
			        return max;
             }
  }