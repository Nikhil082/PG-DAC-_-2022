public class P25 {
    public static void main(String[] args) {
     
        int number=5;
		
        String st="*";
		
        for(int i=1;i<=number;i++){


            for(int j=number;j>=i;j--){

                System.out.print(" ");

            }

            for(int j=1;j<=i;j++){

                System.out.print(st);

            }

            for(int j=1;j<=i-1;j++){

                System.out.print("*");


            }

            System.out.println();

        }
    
    
    }
    
    
    }
