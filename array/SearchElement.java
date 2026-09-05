import java.util.Scanner;
public class SearchElement{
  public static void main(String[]args){

    // Finding SearchElement 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the element to search: ");
    int target = sc.nextInt();
    int [] arr = {1,2,3,4,5};

    // loop
    
    for(int i=0; i<arr.length; i++){
      if(target == arr[i]){
        System.out.println(arr[i] + " is found at index " + i);
      }
    }
  }
}
