public class P35{
    public static void main(String[] args) {
        
        int number=5;

        for(int i=1;i<=number;i++){

            for(int j=1;j<=i;j++){

                if(i==1 ||j==1 || i==number || j==number || j==i){

                    System.err.print("*");

                }
                else{

                    System.err.print(" ");

                }

            }
            System.out.println();

        }



    }

}   