public class simplebubble {
  public static void main(String[] args) {
    

    // Simple bubble;
    
    int [] arr = {5,4,2,1};
    for(int i=0; i<=arr.length-1; i++){

      for(int j=0; j<arr.length-1; j++){
        if(arr[j]>arr[j+1]){
          int temp =arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }



    }

  }
  
}
