public class MinNum{
  public static void main(String[]args){

    // Minimum element

    int [] arr = {10,20,30,40};
      int num = arr[0];
      for(int i=0; i<arr.length; i++){
      if(arr[i]<num){
        num = arr[i];
      }
    }
    System.out.println(num);
  }
}

/*
🟢 Level 1 — Must know
Find largest element
Find smallest element
Find sum of elements
Find average
Count even/odd
Search an element (Linear Search)
Reverse an array
Check if array is sorted
Find second largest
Count frequency of an element
 */