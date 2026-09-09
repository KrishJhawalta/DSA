public class HowToSelectionSort {
    public static void main(String[]args){

        // array 
        int [] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        // loop for full array 

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){

                if(arr[i]>arr[j]){

                    // swap 
                    int temp = arr[i];      // temp = a 
                    arr[i] = arr[j];        // a = b
                    arr[j] = temp;          // b = temp
                }
            }
        }
    
        // printing array 
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
       











    }
    
}
