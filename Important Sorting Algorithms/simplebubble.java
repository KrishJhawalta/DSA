public class simplebubble {
  public static void main(String[] args) {
    

    // Simple bubble sort;
    
    int [] arr = {5,4,2,1};    // unsorted array 

    for(int i=0; i<=arr.length-1; i++){

      for(int j=0; j<arr.length-1; j++){
        if(arr[j]>arr[j+1]){     //checking condition
          int temp =arr[j];       // store value of arr[j]
          arr[j] = arr[j+1];     // stores value of next values
          arr[j+1] = temp;        // swap value to first comparison
        }
      }
    }
  }
}
