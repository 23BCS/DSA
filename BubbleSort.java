
public class BubbleSort{
    public static void Sorting(int arr[]){
        int  swap= 0 ;
          for(int turn=0; turn< arr.length; turn++){
            for(int j= 0; j<arr.length-1-turn; j++){
                if(arr[j]> arr[j+1]){


                     int temp =arr[j];
                     arr[j]= arr[j+1];
                     arr[j+1]= temp;
                     swap++;
                }
               
            }
          }
          System.out.println("Number of swap :" + swap);
    }


    public static void Print(int arr[]){
        for (int i =0 ; i < arr.length; i++) {
               System.out.println(arr[i] + " ");
        }
 
       
    }
    public static void main(String[] args) {
        int arr[]={9,3,16,4,1,5,7,8,2};
        Sorting(arr);
        Print(arr);
    }
}