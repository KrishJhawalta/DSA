public class findelement{
  public static void main(String[]args){

    // findelement
    int element = 5;
    int num =0;
    int [] arr = {1,2,4,7,5};

    for(int i=0; i<arr.length; i++){
      if(element==arr[i]){
        System.out.println("Present");
      }
    }
  
  }
}
