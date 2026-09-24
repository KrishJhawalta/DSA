public class Pattern1{
    public static void main(String[]args){

        /*
        Pattern 1
        ****
        ****
        ****
        ****
        
        */

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("*");
            }System.out.println();
        }


        /*
        Pattern 2
        *
        **
        ***
        ****
         */
        for(int i=0; i<4; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}