
	/*
	
	   *
	  ** 
	 ***
	****
	
	
	*/
	
	
import java.util.*;

class P1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to print star pattern : ");
		int number=sc.nextInt();
		
		//outer for loop
		for(int i=1;i<=number;i++){
			
			//Inner for loop for Spaces printing
			for(int j=1;j<=number-i;j++){       //spaces are decreasing as n-2
				System.out.print(" ");
				
			}
			// Inner For loop for * printing
			for(int j=1;j<=i;j++){
				System.out.print("*");
				
				
			}
			System.out.println();
			
			
		}
		
		
		
	}
	
	
	
}