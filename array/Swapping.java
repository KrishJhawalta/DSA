public class Swapping {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5};
     
        for(int i=0; i<arr.length; i++){
            int [] temp = arr[i];
            arr[1] = arr[0];
            arr[0] = arr[1];
        }
        System.out.println("After swapping: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
