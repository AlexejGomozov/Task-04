package by.htp.decomposition.logic;
import java.util.Arrays;
/*Дано натуральное число N. Написать метод(методы) для формирования массива, 
  элементами которого являются цифры числа N.
       Given a natural number N. Write a method (methods) to form an array whose 
       elements are the digits of N. */
 

   public class Task13 {
   public static void task() {
	int a = 34587;
	
   System.out.println(Arrays.toString(splitNumb(a)));
   }
        public static int [] splitNumb(int a) {
	
	    String stringNumber = String.valueOf(a);         
	                                                  
	    char [] numberChar = new char [stringNumber.length()];  
	    int [] numberInt = new int [stringNumber.length()];
	
	    for (int i = 0; i<stringNumber.length(); i++) {
		    numberChar[i] = stringNumber.charAt(i);      
		    numberInt[i] = Integer.parseInt(numberChar[i]+ ""); 
	    }
	return (numberInt);
}
}
