public class P17 {
    public static void main(String[] args){

        int number=5;
        char ch='A';

        for(int i=5;i>=1;i--){

            for(int j=1;j<=i;j++){

                System.out.print(" "+ch+" ");
                ch++;

            }
            System.out.println();
            ch='A';

        }
    }
}