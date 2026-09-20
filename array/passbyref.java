public class passbyref{
    public static void main(String[]args){
 

        // array 
        int [] arr = {1,2,3,4,5};
        int i=0;
        int k = arr.length;
        int j=k-1;


        // loop
        while(i<j){

            // changing value
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}