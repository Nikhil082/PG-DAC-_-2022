public class P11 {
    public static void main(String[] args) {
        char ch='A';
        int number=5;

        for(int i=1;i<=number;i++){

            for(int j=5;j>=i;j--){

                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
            ch='A';
        }
    }
}