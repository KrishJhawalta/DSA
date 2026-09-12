// This is an practice question
public class TwoSum{
  public static void main(String[]argsStrings){

    int [] arr = {2,4,7,6};
    int target = 8;
    

    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i]+arr[j]==target){
          System.out.println("Addition of "+arr[i]+" and "+arr[j]+" is equal to target value "+target);
        }
        
      }
    }
  }
}
