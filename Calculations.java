public class Calculations {
	public static void Downhourglass(int num, int format){
		
		if (num < 1)
		return;
		
		for (int counterdown = 0; counterdown < format; counterdown++) // it makes spaces  
	    System.out.printf(" ");  
		for (int counterdown = 0; counterdown < num; counterdown++) 
		System.out.print("* ");
		System.out.print("\n");	 
			
		Downhourglass(num - 1, format + 1); 
	}
		
	public static void uphourglass(int num, int format){
		
		  if (num < 1) // Base condition  
		  return;  
		
		  // Recursive call  
		  uphourglass(num - 1, format + 1);  
		  
		  for (int counterup = 0; counterup < format; counterup++) // it makes spaces  
		        System.out.printf(" ");  
		  for (int counterup = 0; counterup < num; counterup++) // for print *  
			  	System.out.printf("* ");  
		  		System.out.printf("\n"); // for next line  
		}  
}



