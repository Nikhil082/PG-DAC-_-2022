import java.util.*;


class P7{

	public static void main(String[] args){
		
		Scanner ni=new Scanner(System.in);
		System.out.println("Enter the no. to print the pattern :");
		int number=ni.nextInt();
		
		
		char ch='A';
		
		for(int i=1;i<=number;i++){
			
			for(int j=1;j<=i;j++){
				
				
				System.out.print(ch +" ");
				
			}
			System.out.println();
			ch++;
		}
		
		
		
		
		
		
		
		}
		
		
		
		}