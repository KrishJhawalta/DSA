public class SwapElement {
    public static void main(String[]args){

        int [] arr = {10, 20, 30, 40, 50};
        // int temp = arr[0];
        // arr[0] = arr[4];
        // arr[4] = temp;

        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // printing array swapping element 2 to 4 and 1 to 5

        // int left =0;
        // int right = arr.length - 1;
        // while(left<right){
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;
        //     left++;     
        //     right--;
            
    

        // }
        // for(int i=0; i < arr.length; i++){
        // System.out.print(arr[i]);}

        int temp =arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        temp++;

        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i] + " ");
        }

    }
    
}
