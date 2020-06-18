package by.htp.decomposition.logic;

public class Task04 {
public static void task() {
	
	int a, b, c;
	a = 71;
	b = 34;                              // done 
	c = 986;

	gcd (a, b, c); 
	
	
}

public static int gcd (int a, int b, int c) {
	
	int gcd = 1;
	int  i, j, h; 
	int k1, k2, k3;
	k1 = 0;
	k2 = 0;
	k3 = 0;
	for (i = 1; i <=(a*b*c); i++) {
		k1 = a * i;
		                                          
	    for ( j = 1; j <= (a*b*c); j++) {
	    	k2 = b * j;              
	    	   if (k1 == k2) {
	    		                                
		         for ( h = 1; h <= (a*b*c) ; h++) {
		             k3 = c * h;	       
		               if (k2 == k3) {
		                 System.out.println(k3);
		        		
		        	   return  k3 ;	
					    } 
			                       }
			                          }
			                            }		
		                                       }
                                           	  
	return  k3 ;	
}
}
