/**
 * QuickRevision
 */
public class QuickRevision {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};

        // for(int i=0; i<=arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // advance method for traversing ( used only reading )
        // for(int x: arr){
        //     System.out.println(x);
        // }


        // reverse traversing
//        for(int i=arr.length-1; i>=0; i--){
//            System.out.println(arr[i])};

//        // for every second element
//        for(int i=0; i<arr.length; i+=2){
//            System.out.println(arr[i]);
//        }

// searching an element
int target =3;
for(int i=0; i<=arr.length; i++){
    if(target==arr[i]){
        System.out.println("Target found at index: "+i);
    }
}





    }
}
