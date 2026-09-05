import java.util.Scanner;
public class SearchElement{
  public static void main(String[]args){

    // Finding SearchElement 

    Scanner sc = new Scanner(System.in);

    // input from user
    System.out.print("Enter the element to search: ");
    int target = sc.nextInt();
    int [] arr = {1,2,3,4,5};

    // loop
    
    for(int i=0; i<arr.length; i++){

      if(target == arr[i]){

        System.out.println("target is present in the array");
        return;
        

      }}
        System.out.println("target is not present in the array");
       
      
    
  }
}
