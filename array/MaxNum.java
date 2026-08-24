public class MaxSum{
  public static void main(String[]args){

    int max = arr[0];

    int [] arr = {1,2,3,4,5};
    for(int i=0; i<arr.length; i++){
      if(arr[i]>max){
        max = arr[i];
      }

    }
  System.err.println(max);
  }
}
