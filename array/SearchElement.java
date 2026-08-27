public class SearchElement{
  public static void main(String[]args){

    // Finding SearchElement 
    int target = 5;
    int [] arr = {1,2,3,4,5};

    for(int i=0; i<arr.length; i++){
      if(target == arr[i]){
        System.out.println(arr[i]);
      }
    }
  }
}
