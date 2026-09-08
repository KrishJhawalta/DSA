public class HowToSelectionSort {
    public static void main(String[]args){

        // array 
        int [] arr = {64, 25, 12, 22, 11};

        // loop for full array 
    
        for(int i=0; i<arr.length-1; i++){

            int min =i;

            for(int j=i+1; j<arr.length; j++){

                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

       











    }
    
}
