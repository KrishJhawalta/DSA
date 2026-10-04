/**
 * Pattern8
*********
 *******
  *****
   ***
    *

 */
public class Pattern8 {

    public static void main(String[] args) {

        // loop for outer row
        for(int i=0; i<=4; i++){

        // loop for space
        for(int j=0; j<i; j++){
        System.out.print(" ");}

        // loop for star
        for(int s=1; s<=9-2*i; s++){
            System.out.print("*");
        }
        System.out.println();
    }



    }
}
