public class P12 {
    public static void main(String[] args) {
       
       int number=5;
       char ch ='A';

       for(int i=1;i<=number;i++){

                for(int j=5;j>=i;j--){

                    System.out.print(" ");
                    
                }
                for(int j=1;j<=i;j++){

                    System.out.print(ch +" ");

                }

                System.out.println();
                ch++;
       }                 
       
    }
}