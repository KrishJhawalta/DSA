public class BubbleSortQues{
    public static void main(String[]args){
        
        // int [] arr = {4,1,3,9,7};
        // int n = arr.length;
        
        // for(int i=0; i<n-1; i++){
        //     for(int j=0; j<n-i-1; j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // for(int k =0; k<n; k++){
        // System.out.print(arr[k] + " ");}


        // Q2: swapping

        int [] arr ={6,4,1};
        int swaps = 0;

        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }

        //Printing values
     
            System.out.println("Array is sorted in " + swaps + " swaps");
            System.out.println("First element is: "+ arr[0]);
            System.out.println("Last element is: "+ arr[n-1]);
    
    }
}