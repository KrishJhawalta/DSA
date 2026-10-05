/**
 * Pattern9
 */
public class Pattern9 {

    public static void main(String[] args) {

        for(int i=0; i<=5; i++){

            for(int j=4; j>i; j--){
                System.out.print(" ");
            }

            for(int s=1; s<=2*i-1; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
}