public class HowToSelectionSort {
    public static void main(String[]args){

        // array 
        int [] arr = {64, 25, 12, 22, 11};

        // loop for full array 
    
        for(int i=0; i<arr.length-1; i++){

            int min =i;

            // loops for selecting array next elements
            for(int j=i+1; j<arr.length; j++){

                // comparing elements
                if(arr[min] > arr[j]){
                    min = j;
                }

            }

            // printin

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println[arr[i]];

       











    }
    
}
