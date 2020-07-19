package by.htp.decomposition.logic;

/* Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр 
 и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи 
 использовать декомпозицию.
  The sum of its digits was subtracted from the given number. The sum of its digits was 
  again subtracted from the result, etc. How many such actions need to be done to get 
  zero? To solve the problem, use the decomposition*/

       public class Task20 {
                        	
	    static int count = 0;                                    //счетчик 
	
	      public static int subtractAmount(int x) {
		
		    String stringSubAmnt = String.valueOf(x);       
		
		      int lengthSubAmnt = stringSubAmnt.length();         // количество цифр для суммы в данном числе
		
		        int sum = 0;
			
		          int x1 = x;                                    //переименовал данное число чтобы из него выделить цифры 
		                                                          //и чтобы эта работа с числом не изменила данное число(его значение понадобится в return)
		            for (int i = 1; i<=lengthSubAmnt; i++) {
			
			         int s = x1 % 10;
			
			           x1 = x1/10;
			
			            sum += s;
			 
		                  } 
		                   count ++;
		                   
		                    if (sum <= 0) return count;             //возвращаем счетчик
		                    
		                      return subtractAmount(x - sum);       // рекурсия до тех пор пока не получится '0'
	                           }
		
	                          public static void task() {
		
		                   int a = 2339;                             //здесь можно использовать Scanner or random
		
		               System.out.println("Из числа "+ a + " вычли сумму его цифр. \n "
		            		   
		       	+ "Это сделали " + subtractAmount(a) + " раз(а), пока не получился '0'.");
		
	          }
          }
