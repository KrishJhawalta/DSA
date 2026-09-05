public class EvenOddCount{
  public static void main(String[]args){

    int even = 0;
    int odd = 0;
    
    int [] arr = {1,2,3,4,5,6,7,8};
    for(int i =0; i<arr.length; i++){
      if(arr[i]%2==0){
        even++;           // counts  even number
      }else{
        odd++;          // counts odd number
      }
    }
    System.out.println("Even: "+even);
    System.out.println("Odd: "+odd);
  }
}
