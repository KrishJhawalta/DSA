import java.util.Scanner;
public class TakeInput{
  public static void main(String[]args){

    // Scanner class
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.print("Enter inputs: ");
    int [] arr = new int[n];

    // Printing Arrays
    for(int i =0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }


  }
}
