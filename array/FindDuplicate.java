public class FindDuplicate{
  public static void main(String[]args){

    int repeat = 0;

    int [] arr = {1,2,3,4,4,5};
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){

      if(arr[i]==arr[j]){
        repeat = arr[i];
        break;
      }}}

  System.out.println("Repeat: "+repeat);
    
  }
}
